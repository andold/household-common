package kr.andold.household.entity;

import java.net.URLDecoder;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Map;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;
import kr.andold.household.domain.AccountType;
import kr.andold.utils.Utility;

import javax.validation.constraints.NotNull;

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
@Table(name = "account")
@NoArgsConstructor
@AllArgsConstructor
public class Account {
	@Getter
	@Setter
	@Id
	@Column(name = "account_id")
	@NotNull
	private Integer id;

	@Getter
	@Column(name = "account_description")
	@Nullable
	private String title;

	@Getter
	@Setter
	@Column(name = "account_producer")
	@Nullable
	private String producer;

	@Getter
	@Column(name = "account_number")
	@Nullable
	private String number;

	@Getter
	@Setter
	@Column(name = "account_owner")
	@Nullable
	private String owner;

	@Getter
	@Setter
	@Column(name = "account_type")
	@Nullable
	private Integer type;

	@Getter
	@Setter
	@Column(name = "account_amount")
	@NotNull
	private Integer balance;

	@Getter
	@Setter
	@Column(name = "account_amounted")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	@Nullable
	private Date time;

	@Getter
	@Setter
	@Column(name = "account_open_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	@Nullable
	private Date dateOpened;

	@Getter
	@Setter
	@Column(name = "account_expire_date")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	@Nullable
	private Date dateClosed;

	@Getter
	@Setter
	@Column(name = "account_created")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	@Nullable
	private Date dateCreated;

	@Getter
	@Setter
	@Column(name = "account_updated")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "Asia/Seoul")
	@Temporal(TemporalType.TIMESTAMP)
	@Nullable
	private Date dateUpdated;
	//	primitive end

	@Getter
	@Setter
	@Transient
	@JsonIgnore
	private Map<String, Statement> mapCurrentStatement;

	public Account(Account account) {
		BeanUtils.copyProperties(account, this);
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setTitle(String title, String... args) {
		this.title = Utility.append(title, Utility.append(args));
	}

	public void setNumber(String number) {
		this.number = number;
	}
	public void setNumber(String number, String... args) {
		this.number = Utility.append(number, Utility.append(args));
	}

	@JsonIgnore
	public String getJson() {
		return Utility.toStringJson(this);
	}

	@JsonIgnore
	public AccountType getAccountType() {
		return AccountType.of(this.getType());
	}

	@Override
	public String toString() {
		return Utility.toStringJson(this);
	}

	public static Account sample() {
		LocalDateTime localDateTime = LocalDateTime.now();
		return Account.builder()
			.id(23)
			.title("신사임당 예금")
			.producer("한국은행")
			.number("082-010-123456789")
			.owner("홍길동")
			.type(0)
			.balance(123456)
			.time(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()))
			.dateOpened(Date.from(localDateTime.atZone(ZoneId.systemDefault()).truncatedTo(ChronoUnit.DAYS).toInstant()))
			.dateClosed(Date.from(localDateTime.plusYears(1).atZone(ZoneId.systemDefault()).truncatedTo(ChronoUnit.DAYS).toInstant()))
			.dateCreated(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()))
			.dateUpdated(Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant()))
			.build();
	}

	public static Account of(String jsonString) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			return objectMapper.readValue(jsonString, Account.class);
		} catch (Exception e) {
			try {
				return objectMapper.readValue(URLDecoder.decode(jsonString, "UTF-8"), Account.class);
			} catch (Exception f) {
				e.printStackTrace();
				f.printStackTrace();
			}
		}

		return null;
	}

}
