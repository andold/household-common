package kr.andold.household.domain;

import java.util.List;

import org.springframework.beans.BeanUtils;

import kr.andold.household.entity.Statement;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatementParsed extends Statement {
	public StatementParsed(Statement statement) {
		BeanUtils.copyProperties(statement, this);
	}

	private String categoryName;
	private List<Statement> listStatementDuplicated;

}
