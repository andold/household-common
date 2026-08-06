package kr.andold.household.web;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import kr.andold.household.domain.AccountType;
import kr.andold.household.entity.Account;
import kr.andold.household.entity.Category;
import kr.andold.household.entity.Statement;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
public class HouseholdParam {
	private List<AccountParam> accounts;
	private List<CategoryParam> categories;
	private List<StatementParam> statements;

	@Data
	@NoArgsConstructor
	static public class AccountParam {
		private String title;
		private String producer;
		private String number;
		private String owner;
		private String type;
		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
		private Date dateOpened;
		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
		private Date dateClosed;

		public AccountParam(Account account) {
			BeanUtils.copyProperties(account, this);
			setType(AccountType.of(account.getType()).getKorean());
		}

		@Override
		public String toString() {
			return Utility.toStringJsonPretty(this);
		}

		public Account toDomain() {
			Date date = new Date();
			return Account.builder().id(null).title(title).producer(producer).number(number).owner(owner).type(AccountType.of(type).getValue()).balance(0).time(
				date).dateOpened(dateOpened).dateClosed(dateClosed).dateCreated(date).dateUpdated(date).build();
		}

		public static Map<String, Account> makeMap(List<Account> accounts) {
			Map<String, Account> map = new HashMap<>();
			if (accounts == null) {
				return map;
			}
			for (Account account : accounts) {
				map.put(key(account), account);
			}
			return map;
		}

		public static String key(Account account) {
			if (account == null) {
				return "";
			}

			return String.format("%s.%s.%s", account.getProducer(), account.getOwner(), account.getNumber());
		}

		public static Map<String, AccountParam> makeMapAccountParam(List<AccountParam> accounts) {
			Map<String, AccountParam> map = new HashMap<>();
			if (accounts == null) {
				return map;
			}
			for (AccountParam account : accounts) {
				map.put(key(account), account);
			}
			return map;
		}

		private static String key(AccountParam account) {
			return String.format("%s.%s.%s", account.getProducer(), account.getOwner(), account.getNumber());
		}

		public static boolean isSame(Account left, AccountParam right) {
			if (left.getTitle().compareTo(right.getTitle()) != 0) {
				return false;
			}
			if (left.getProducer().compareTo(right.getProducer()) != 0) {
				return false;
			}
			if (left.getNumber().compareTo(right.getNumber()) != 0) {
				return false;
			}
			if (left.getOwner().compareTo(right.getOwner()) != 0) {
				return false;
			}
			if (left.getType().compareTo(AccountType.of(right.getType()).getValue()) != 0) {
				return false;
			}
			if (left.getDateOpened().compareTo(right.getDateOpened()) != 0) {
				return false;
			}
			if (left.getDateClosed().compareTo(right.getDateClosed()) != 0) {
				return false;
			}

			return true;
		}

		public static Account overwrite(Account before, AccountParam after) {
			before.setTitle(after.getTitle());
			before.setType(AccountType.of(after.getType()).getValue());
			before.setDateOpened(after.getDateOpened());
			before.setDateClosed(after.getDateClosed());
			return before;
		}

	}
	@Builder
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	static public class CategoryParam {
		private String title;
		private String color;

		public CategoryParam(Category category) {
			BeanUtils.copyProperties(category, this);
		}

		@Override
		public String toString() {
			return Utility.toStringJsonPretty(this);
		}

		public Category toDomain(Map<String, Category> map) {
			int index = title.lastIndexOf(".");
			Date date = new Date();

			if (index < 0) {
				Category parent = map.get(title);
				if (parent == null) {
					Category category = Category.builder().id(null).title(title).color(color).dateCreated(date).dateUpdated(date).build();
					return category;
				}

				Category category = Category.builder().id(null).title(title).parentId(parent.getId()).color(color).dateCreated(date).dateUpdated(date).build();
				return category;
			}

			Category parent = map.get(title.substring(0, index));
			if (parent == null) {
				Category category = Category.builder().id(null).title(title.substring(index + 1)).color(color).dateCreated(date).dateUpdated(date).build();
				return category;
			}
			Category category = Category.builder().id(null).title(title.substring(index + 1)).parentId(parent.getId()).color(color).dateCreated(date).dateUpdated(
				date).build();
			return category;
		}

		public static Map<String, Category> makeMap(List<Category> categories, Map<Integer, Category> mapCategory) {
			Map<String, Category> map = new HashMap<>();
			for (Category category : categories) {
				map.put(key(category, mapCategory), category);
			}
			return map;
		}

		public static String key(Category category, Map<Integer, Category> mapCategory) {
			if (category == null || (category.getId() == category.getParentId())) {
				return "";
			}

			Category parent = mapCategory.get(category.getParentId());
			if (parent == null || (parent.getId() == parent.getParentId())) {
				return String.format("%s", category.getTitle());
			}

			Category grandpa = mapCategory.get(parent.getParentId());
			if (grandpa == null || (grandpa.getId() == grandpa.getParentId())) {
				return String.format("%s.%s", parent.getTitle(), category.getTitle());
			}

			return String.format("%s.%s.%s", grandpa.getTitle(), parent.getTitle(), category.getTitle());
		}

		public static Map<String, CategoryParam> makeMapCategories(List<CategoryParam> list) {
			Map<String, CategoryParam> map = new HashMap<>();
			if (list == null) {
				return map;
			}
			for (CategoryParam category : list) {
				map.put(category.getTitle(), category);
			}
			return map;
		}

		public static boolean isSame(Category left, CategoryParam right, Map<Integer, Category> mapCategory) {
			if (key(left, mapCategory).compareTo(right.getTitle()) != 0) {
				return false;
			}
			if (left.getColor().compareTo(right.getColor()) != 0) {
				return false;
			}

			return true;
		}

		public static Category overwrite(Category before, CategoryParam after) {
			before.setColor(after.getColor());
			return before;
		}
	}
	@Data
	@NoArgsConstructor
	static public class StatementParam {
		private String title;
		@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
		private Date time;
		private Integer income;
		private Integer outcome;
		private Integer balance;
		private String description;
		private String account;
		private String category;

		public StatementParam(Statement statement) {
			BeanUtils.copyProperties(statement, this);
			if (getDescription() == null) {
				setDescription("");
			}
		}

		@Override
		public String toString() {
			return Utility.toStringJsonPretty(this);
		}

		public Statement toDomain(Map<String, Account> mapAccount, Map<String, Category> mapCategory) {
			Date date = new Date();
			Category categoryEntity = mapCategory.get(this.category);
			Integer categoryId = null;
			if (categoryEntity == null) {
				log.warn("{} no category, 『{}』 {}", Utility.indentMiddle(), this.category, Utility.toStringJson(mapCategory, 32, 32));
				categoryId = 0;
			} else {
				categoryId = categoryEntity.getId();
			}

			Statement statement = Statement.builder().id(null).title(title).time(time).income(income).outcome(outcome).balance(balance).total(0).description(
				description).accountId(mapAccount.get(account).getId()).categoryId(categoryId).parentId(0).dateCreated(date).dateUpdated(date).build();

			return statement;
		}

		public static String key(StatementParam statement) {
			if (statement == null) {
				return "";
			}

			return String.format("%s.%d.%d.%d.%d", statement.getTitle(), statement.getTime().getTime(), statement.getIncome(), statement.getOutcome(),
				statement.getBalance());
		}

		public static String key(Statement statement) {
			if (statement == null) {
				return "";
			}

			return String.format("%s.%d.%d.%d.%d", statement.getTitle(), statement.getTime().getTime(), statement.getIncome(), statement.getOutcome(),
				statement.getBalance());
		}

		public static Map<String, Statement> makeMapByKey(List<Statement> statements) {
			Map<String, Statement> map = new HashMap<>();
			if (statements == null) {
				return map;
			}
			for (Statement statement : statements) {
				map.put(key(statement), statement);
			}
			return map;
		}

		public static boolean isSame(Statement left, Account account, Map<Integer, Category> mapCategory, StatementParam right) {
			if (left.getTitle().compareTo(right.getTitle()) != 0) {
				return false;
			}
			if (left.getTime().compareTo(right.getTime()) != 0) {
				return false;
			}

			if (left.getIncome().compareTo(right.getIncome()) != 0) {
				return false;
			}

			if (left.getOutcome().compareTo(right.getOutcome()) != 0) {
				return false;
			}

			if (left.getBalance().compareTo(right.getBalance()) != 0) {
				return false;
			}

			// nullable
			if (Utility.compare(left.getDescription(), right.getDescription()) != 0) {
				return false;
			}

			if (AccountParam.key(account).compareTo(right.getAccount()) != 0) {
				return false;
			}

			if (CategoryParam.key(mapCategory.get(left.getCategoryId()), mapCategory).compareTo(right.getCategory()) != 0) {
				return false;
			}

			return true;
		}

		public static Statement overwrite(Statement before, StatementParam after, Map<String, Account> mapAccount, Map<String, Category> mapCategory) {
			before.setDescription(after.getDescription());
			String afterAccountKey = after.getAccount();
			if (afterAccountKey != null) {
				Account afterAccount = mapAccount.get(afterAccountKey);
				if (afterAccount != null) {
					before.setAccountId(afterAccount.getId());
				}
			}
			
			Category category = mapCategory.get(after.getCategory());
			if (category == null) {
				before.setCategoryId(0);
			} else {
				before.setCategoryId(category.getId());
			}

			return before;
		}

	}
	@SuperBuilder
	@NoArgsConstructor
	@Data
	static public class PreviousItem {
		private List<Account> accounts;
		private List<Category> categories;
		private List<Statement> statements;
		
		@Override
		public String toString() {
			return String.format("PreviousItem(accounts: #%d, categories: #%d, statements: #%d)", Utility.size(accounts), Utility.size(categories), Utility.size(statements));
		}
	}
	@Data
	static public class DifferResultItem {
		private List<AccountParam> accounts = new ArrayList<>();
		private List<CategoryParam> categories = new ArrayList<>();
		private List<StatementParam> statements = new ArrayList<>();

		@Override
		public String toString() {
			return String.format("DifferResultItem(accounts: #%d, categories: #%d, statements: #%d)", Utility.size(accounts), Utility.size(categories), Utility.size(statements));
		}
	}
	@Data
	static public class DifferResult {
		private DifferResultItem create = new DifferResultItem();
		private DifferResultItem duplicate = new DifferResultItem();
		private PreviousItem update = PreviousItem.builder().accounts(new ArrayList<>()).categories(new ArrayList<>()).statements(new ArrayList<>()).build();
		private PreviousItem remove = PreviousItem.builder().accounts(new ArrayList<>()).categories(new ArrayList<>()).statements(new ArrayList<>()).build();
	}

	public HouseholdParam(List<Account> accounts, List<Category> categories, List<Statement> statements) {
		// accounts
		this.accounts = new ArrayList<>();
		for (Account account : accounts) {
			this.accounts.add(new AccountParam(account));
		}

		// category
		this.categories = new ArrayList<>();
		Map<Integer, Category> mapCategory = Category.makeMap(categories);
		for (Category category : categories) {
			this.categories.add(CategoryParam.builder().title(CategoryParam.key(category, mapCategory)).color(category.getColor()).build());
		}

		// statements
		Map<Integer, Account> mapAccount = Account.makeMap(accounts);
		this.statements = new ArrayList<>();
		for (Statement statement : statements) {
			StatementParam param = new StatementParam(statement);
			this.statements.add(param);

			Account account = mapAccount.get(statement.getAccountId());
			param.setAccount(AccountParam.key(account));

			Category category = mapCategory.get(statement.getCategoryId());
			param.setCategory(CategoryParam.key(category, mapCategory));
		}

	}

	@Override
	public String toString() {
		return Utility.toStringJsonPretty(this);
	}

	public static HouseholdParam of(String text) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			return objectMapper.readValue(text, HouseholdParam.class);
		} catch (Exception e) {
			try {
				return objectMapper.readValue(URLDecoder.decode(text, "UTF-8"), HouseholdParam.class);
			} catch (Exception f) {
				e.printStackTrace();
				f.printStackTrace();
			}
		}

		return null;
	}

	public DifferResult differ(HouseholdParam after, PreviousItem previous, Boolean forceCreate) {
		DifferResult result = new DifferResult();
		int count = 0;

		count += differAccounts(previous.getAccounts(), after.getAccounts(), result);
		count += differCategories(previous.getCategories(), after.getCategories(), result);
		count += differStatements(previous.getStatements(), after.getStatements(), result, previous, forceCreate);

		log.info("{} {}", Utility.indentEnd(), count);
		return result;
	}

	private int differStatements(List<Statement> beforeStatements, List<StatementParam> afterStatementParams, DifferResult result, PreviousItem previous, Boolean forceCreate) {
		List<StatementParam> creates = result.getCreate().getStatements();
		List<StatementParam> duplicates = result.getDuplicate().getStatements();
		List<Statement> updates = result.getUpdate().getStatements();
		List<Statement> removes = result.getRemove().getStatements();

		int count = 0;
		Map<Integer, Account> mapAccount = Account.makeMap(previous.getAccounts());
		Map<String, Account> mapKeyAccount = AccountParam.makeMap(previous.getAccounts());
		Map<Integer, Category> mapCategory = Category.makeMap(previous.getCategories());
		Map<String, Category> mapKeyCategory = CategoryParam.makeMap(previous.getCategories(), mapCategory);
		Map<Integer, Statement> mapBefore = Statement.makeMap(beforeStatements);
		Map<String, Statement> mapKeyBefore = StatementParam.makeMapByKey(beforeStatements);
		Map<String, StatementParam> mapKeyAfter = makeMapStatements(afterStatementParams);
		for (Statement before : mapBefore.values()) {
			String key = StatementParam.key(before);
			StatementParam after = mapKeyAfter.get(key);
			if (after == null) {
				removes.add(before);
				count++;
				continue;
			}

			if (StatementParam.isSame(before, mapAccount.get(before.getAccountId()), mapCategory, after)) {
				duplicates.add(after);
				continue;
			}

			count++;
			StatementParam.overwrite(before, after, mapKeyAccount, mapKeyCategory);
			updates.add(before);
		}
		for (String key : mapKeyAfter.keySet()) {
			StatementParam after = mapKeyAfter.get(key);
			Statement before = mapKeyBefore.get(key);
			if (before == null) {
				creates.add(after);
				count++;
				continue;
			}

		}

		int max = 1024 * 4;
		// truncate
		if (!forceCreate && creates.size() > max) {
			creates.subList(max, creates.size()).clear();
		}
		if (duplicates.size() > 256) {
			duplicates.subList(256, duplicates.size()).clear();
		}
		if (updates.size() > max) {
			updates.subList(max, updates.size()).clear();
		}
		if (removes.size() > max) {
			removes.subList(max, removes.size()).clear();
		}

		return count;
	}

	private int differCategories(List<Category> beforeCategories, List<CategoryParam> afterCategories, DifferResult result) {
		List<CategoryParam> creates = result.getCreate().getCategories();
		List<CategoryParam> duplicates = result.getDuplicate().getCategories();
		List<Category> updates = result.getUpdate().getCategories();
		List<Category> removes = result.getRemove().getCategories();

		int count = 0;
		Map<Integer, Category> mapCategory = Category.makeMap(beforeCategories);
		Map<String, CategoryParam> mapKeyBefore = CategoryParam.makeMapCategories(getCategories());
		Map<String, CategoryParam> mapKeyAfter = CategoryParam.makeMapCategories(afterCategories);
		for (Category before : beforeCategories) {
			String key = CategoryParam.key(before, mapCategory);
			CategoryParam after = mapKeyAfter.get(key);
			if (after == null) {
				removes.add(before);
				count++;
				continue;
			}

			if (CategoryParam.isSame(before, after, mapCategory)) {
				duplicates.add(after);
				continue;
			}

			count++;
			CategoryParam.overwrite(before, after);
			updates.add(before);
		}
		for (String key : mapKeyAfter.keySet()) {
			CategoryParam after = mapKeyAfter.get(key);
			CategoryParam before = mapKeyBefore.get(key);
			if (before == null) {
				creates.add(after);
				count++;
				continue;
			}
		}

		return count;
	}

	private int differAccounts(List<Account> beforeAccounts, List<AccountParam> afterAccounts, DifferResult result) {
		List<AccountParam> creates = result.getCreate().getAccounts();
		List<AccountParam> duplicates = result.getDuplicate().getAccounts();
		List<Account> updates = result.getUpdate().getAccounts();
		List<Account> removes = result.getRemove().getAccounts();

		int count = 0;
		Map<String, AccountParam> mapKeyBefore = AccountParam.makeMapAccountParam(getAccounts());
		Map<String, AccountParam> mapKeyAfter = AccountParam.makeMapAccountParam(afterAccounts);
		for (Account before : beforeAccounts) {
			String key = AccountParam.key(before);
			AccountParam after = mapKeyAfter.get(key);
			if (after == null) {
				removes.add(before);
				count++;
				continue;
			}

			if (AccountParam.isSame(before, after)) {
				duplicates.add(after);
				continue;
			}

			count++;
			AccountParam.overwrite(before, after);
			updates.add(before);
		}
		for (String key : mapKeyAfter.keySet()) {
			AccountParam after = mapKeyAfter.get(key);
			AccountParam before = mapKeyBefore.get(key);
			if (before == null) {
				creates.add(after);
				count++;
				continue;
			}
		}

		return count;
	}

	private Map<String, StatementParam> makeMapStatements(List<StatementParam> statements) {
		Map<String, StatementParam> map = new HashMap<>();
		if (statements == null) {
			return map;
		}
		for (StatementParam statement : statements) {
			map.put(StatementParam.key(statement), statement);
		}
		return map;
	}

}
