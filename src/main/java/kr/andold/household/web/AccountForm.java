package kr.andold.household.web;

import kr.andold.household.domain.Account;
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
public class AccountForm extends Account {
	public static final AccountForm ACCOUNT = new AccountForm();

	//	extra
	@Builder.Default @Getter @Setter private boolean closed = false;
	@Builder.Default @Getter @Setter private boolean zero = false;
	@Builder.Default @Getter @Setter private int page = 0;
	@Builder.Default @Getter @Setter private int size = Integer.MAX_VALUE;

	public void setDateOpenedString(String string) {
		setDateOpened(Utility.parseDateTime(string));
	}

	public void setDateClosedString(String string) {
		setDateClosed(Utility.parseDateTime(string));
	}

	@Override
	public String toString() {
		return Utility.toStringJson(this);
	}
}
