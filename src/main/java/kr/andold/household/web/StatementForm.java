package kr.andold.household.web;

import java.util.Date;
import java.util.List;
import java.util.Map;

import kr.andold.household.entity.Category;
import kr.andold.household.entity.Statement;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class StatementForm extends Statement {
	@Getter @Setter private String keyword;
	@Getter @Setter private Long from;		//	start time
	@Getter @Setter private Long to;		//	end time
	@Getter @Setter private Integer major;	//	major category id
	@Getter @Setter private Integer minor;	//	minor category id
	@Getter @Setter private List<Integer> listCategoryId;	//	2018-12-11	andold	kwaheon-kwon/andold-household#2	stats - chart for return on investment
	@Getter @Setter private List<Integer> listCategoryIdExcept;
	@Getter @Setter private List<Integer> listAccountId;	//	2018-12-11	andold	kwaheon-kwon/andold-household#2	stats - chart for return on investment

	@Getter @Setter private Date updatedStart;	//	start <= dateUpdated. include.
	@Getter @Setter private Date updatedEnd;	//	dateUpdated < end. exclude.

	@Getter private String accountName;	//	2018-03-13	andold	for parse
	@Getter @Setter private String categoryName;	//	2018-03-13	andold	for parse
	
	@Getter @Setter private Boolean includeVirtualAccount;	//	2020-03-03	andold	#37 synchronize without virtual account

	@Getter @Setter private String producer;
	@Getter @Setter private String owner;

	@Getter @Setter private Boolean appendableString;	//	2021-03-08	andold	수정시 스트링 타입인 경우, append할지 받은 값으로 저장할지?

	@Builder.Default @Getter @Setter private int number = 0;
	@Builder.Default @Getter @Setter private int size = 32;
	
	public void setTimestamp(Long timestamp) {
		if (timestamp == null) {
			return;
		}

		setTime(new Date(timestamp));
	}

	//	alias from .vs. start
	public Date getStart() 				{		return Utility.newDate(getFrom(), 0);						}
	public void setStart(Date start) 	{		if (start != null) {	setFrom(start.getTime());	}	}

	//	alias to .vs. end
	public Date getEnd() 				{		return Utility.newDate(getTo(), 0);						}
	public void setEnd(Date end)	 	{		if (end != null) {	setTo(end.getTime());	}	}

	//	expand parameter type for parse
	public void setAccountName(String string, String... args) {
		this.accountName = safeStringAppend(string, args);
	}

	//	expand parameter type for parse
	public void setTitle(String title, String... args) {
		if (appendableString == null) {
			setTitle(safeStringAppend(title, args));
			return;
		}
		
		if (appendableString.booleanValue()) {
			setTitle(safeStringAppend(title, args));
			return;
		}
		
		setTitle(safeStringAppend(null, args));
	}

	public void setDescription(String description, String... args) {
		if (appendableString == null) {
			setDescription(safeStringAppend(description, args));
			return;
		}
		
		if (appendableString.booleanValue()) {
			setDescription(safeStringAppend(description, args));
			return;
		}

		setDescription(safeStringAppend(null, args));
	}

	public void setIncome(String... args)	{	setIncome(parseAmount(args, 0));	}
	public void setOutcome(String... args)	{	setOutcome(parseAmount(args, 0));	}
	//	balance
	public void setBalance(String... args)	{	setBalance(parseAmount(args, 0));	}
	public void setTime(String... args)	{		setTime(Utility.parseDateTime(args));	}

	private String safeStringAppend(String string, String[] args) {
		StringBuffer stringBuffer = new StringBuffer("");
		if(string != null) {
			stringBuffer.append(string.replaceAll("[　\n\"]+", " ").trim());
		}
		
		if(args == null || args.length == 0) {
			return new String(stringBuffer).trim();
		}
		
		for (String arg : args) {
			if(arg == null || arg.trim().isEmpty()) {
				continue;
			}
			
			stringBuffer.append(" ");
			stringBuffer.append(arg.replaceAll("[　]+", "").trim());
		}

		return new String(stringBuffer).trim();
	}

	private int parseAmount(String[] args, int defaultValue) {
		if(args == null || args.length == 0) {
			setOutcome(0);
			return defaultValue;
		}
		
		int amount = 0;
		for (String arg : args) {
			if (arg == null) {
				continue;
			}

			amount += Utility.parseInteger(arg.replaceAll("[^\\-\\.\\d]+", ""), 0);
		}

		return amount;
	}
	
	@Override
	public String toString() {
		return Utility.toStringJson(this);
	}

	public static Statement toEntity(StatementForm form, Map<String, Category> map) {
		Statement statement = new Statement(form);
		Category category = map.get(form.getCategoryName());
		if (category != null) {
			statement.setCategoryId(category.getId());
		}

		return statement;
	}

}
