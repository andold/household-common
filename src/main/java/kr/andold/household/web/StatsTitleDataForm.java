package kr.andold.household.web;

import java.util.Date;

import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StatsTitleDataForm {
	private String title;
	private Integer duration;
	private Date start;
	private Date end;

	private Integer pageNumber;
	private Integer pageSize;

	@Override
	public String toString() {	return Utility.toStringJson(this);	}
}
