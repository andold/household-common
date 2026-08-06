package kr.andold.household.domain;

import java.util.List;

import kr.andold.household.entity.Account;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountParsed extends Account {
	private List<StatementParsed> listStatementParsed;

}
