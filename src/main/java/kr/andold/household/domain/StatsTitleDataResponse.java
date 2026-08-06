package kr.andold.household.domain;

import kr.andold.household.entity.StatsData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StatsTitleDataResponse extends StatsData {
	private String title;

}
