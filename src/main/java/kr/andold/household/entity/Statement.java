package kr.andold.household.entity;

import java.net.URLDecoder;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import kr.andold.utils.Utility;

import org.springframework.beans.BeanUtils;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Entity
@Table(name = "statement")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class Statement {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "statement_id")
	@Id
	private Integer id;

	@Column(name = "statement_content")
	private String title;

	@Column(name = "statement_time")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	private Date time;

	@Column(name = "deposit_amount")
	private Integer income;

	@Column(name = "withdraw_amount")
	private Integer outcome;

	@Column(name = "balance_amount")
	private Integer balance;

	@Column(name = "total_cash")
	private Integer total;

	@Column(name = "statement_description")
	private String description;

	@Column(name = "account_id")
	private Integer accountId;

	@Column(name = "category_id")
	private Integer categoryId;

	@Column(name = "statement_id_parent")
	private Integer parentId;

	@Column(name = "statement_created")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;

	@Column(name = "statement_updated")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateUpdated;

	public Statement(Statement statement) {
		BeanUtils.copyProperties(statement, this);
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setTitle(String title, String... args) {
		this.title = Utility.append(title, Utility.append(args));
	}

	public void setDescription(String description)	{
		this.description = description;
	}
	public void setDescription(String description, String... args)	{
		if (args == null || args.length == 0) {
			setDescription(description);
			return;
		}

		String cx = description == null ? "" : description.trim();
		for (String arg : args) {
			if(arg == null || arg.trim().isEmpty()) {
				continue;
			}
			
			cx += (" " + arg.trim());
		}

		setDescription(cx.trim());
	}

	public String keyDuplicate(boolean shortKey) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(time);
		if (shortKey) {
			return String.format("%d.%d.%tF", Utility.intValue(income, 0), Utility.intValue(outcome, 0), calendar);
		}

		return String.format("%d.%d.%tF %<tR", Utility.intValue(income, 0), Utility.intValue(outcome, 0), calendar);
	}

	@JsonIgnore
	public String getJson() {
		return Utility.toStringJson(this);
	}

	public static Statement of(String string) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			return objectMapper.readValue(string, Statement.class);
		} catch (Exception e) {
			try {
				return objectMapper.readValue(URLDecoder.decode(string, "UTF-8"), Statement.class);
			} catch (Exception f) {
				e.printStackTrace();
				f.printStackTrace();
			}
		}

		return null;
	}

	@Override
	public String toString() {
		return Utility.toStringJson(this);
	}

	public static Statement sample() {
		return new Statement(23, "옥션 - 모카골드 마일드 커피믹스 210T", new Date(), 0, 23520, 10929365, 12341234, "자금결제부 체크카드", 9740, 13293, 0, new Date(), new Date());
	}

	public void defaultIfNull() {
		if (getTitle() == null) {
			setTitle("");
		}
		if (getDescription() == null) {
			setDescription("");
		}
		if (getIncome() == null) {
			setIncome(0);
		}
		if (getOutcome() == null) {
			setOutcome(0);
		}
		if (getBalance() == null) {
			setBalance(0);
		}
		if (getTotal() == null) {
			setTotal(0);
		}
		if (getAccountId() == null) {
			setAccountId(0);
		}
		if (getCategoryId() == null) {
			setCategoryId(0);
		}
		if (getParentId() == null) {
			setParentId(0);
		}
		Date date = new Date();
		if (getTime() == null) {
			setTime(date);
		}
		if (getDateCreated() == null) {
			setDateCreated(date);
		}
		if (getDateUpdated() == null) {
			setDateUpdated(date);
		}
	}

	public int compareIfNotNull(Statement before) {
		int compared = Utility.compare(getTitle(), before.getTitle());
		if (compared != 0) {
			return compared;
		}

		if (getTime() != null) {
			compared = Utility.compare(getTime(), before.getTime());
			if (compared != 0) {
				return compared;
			}
		}

		if (getIncome() != null) {
			compared = Utility.compare(getIncome(), before.getIncome());
			if (compared != 0) {
				return compared;
			}
		}

		if (getOutcome() != null) {
			compared = Utility.compare(getOutcome(), before.getOutcome());
			if (compared != 0) {
				return compared;
			}
		}

		if (getBalance() != null) {
			compared = Utility.compare(getBalance(), before.getBalance());
			if (compared != 0) {
				return compared;
			}
		}

		if (getDescription() != null) {
			compared = Utility.compare(getDescription(), before.getDescription());
			if (compared != 0) {
				return compared;
			}
		}

		if (getAccountId() != null) {
			compared = Utility.compare(getAccountId(), before.getAccountId());
			if (compared != 0) {
				return compared;
			}
		}

		if (getCategoryId() != null) {
			compared = Utility.compare(getCategoryId(), before.getCategoryId());
			if (compared != 0) {
				return compared;
			}
		}

		return 0;
	}

	public static Map<Integer, Statement> makeMap(List<Statement> list) {
		Map<Integer, Statement> map = new HashMap<Integer, Statement>();
		if (list == null) {
			return map;
		}

		for (int cx = 0, sizex = list.size(); cx < sizex; cx++) {
			Statement statement = list.get(cx);
			if (statement == null) {
				continue;
			}

			map.put(statement.getId(), statement);
		}

		return map;
	}

}
