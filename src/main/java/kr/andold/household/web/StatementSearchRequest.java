package kr.andold.household.web;

import java.util.Date;
import java.util.List;

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
public class StatementSearchRequest extends Statement {
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

	@Getter @Setter private String categoryName;	//	2018-03-13	andold	for parse
	
	@Getter @Setter private Boolean includeVirtualAccount;	//	2020-03-03	andold	#37 synchronize without virtual account

	@Getter @Setter private String producer;
	@Getter @Setter private String owner;

	@Getter @Setter private Boolean appendableString;	//	2021-03-08	andold	수정시 스트링 타입인 경우, append할지 받은 값으로 저장할지?

	@Builder.Default @Getter @Setter private Integer number = 0;
	@Builder.Default @Getter @Setter private Integer size = 32;

	//	alias from .vs. start
	public Date getStart() 				{		return Utility.newDate(getFrom(), 0);						}
	public void setStart(Date start) 	{		if (start != null) {	setFrom(start.getTime());	}	}

	//	alias to .vs. end
	public Date getEnd() 				{		return Utility.newDate(getTo(), 0);						}
	public void setEnd(Date end)	 	{		if (end != null) {	setTo(end.getTime());	}	}

}
