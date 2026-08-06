package kr.andold.household.domain;

import lombok.Getter;

public enum AccountType {
	UNDEFINED(			0,		"미정"), //	reserved
	CASH(				100,	"현금"), //	현금
	DEPOSIT(			200,	"예금"), //	예금
	FIXED_DEPOSIT(		300,	"정기예금"), //	정기예금
	INSTALLMENT_SAVING(	400,	"적금"), //	적금
	INVESTMENT(			500,	"투자"), //	투자
	FUND(				600,	"펀드"), //	펀드
	INSURANCE(			700,	"보험"), //	보험
	LOAN(				800,	"대출"), //	대출
	CREDIT_CARD(		900,	"신용카드")	//	신용카드
	,	CHECK_CARD(		1000,	"체크카드")	//	체크카드
	,	VIRTUAL(		1100,	"가상계좌")	//	가상계좌. 투자원금 및 손익금 계산.	stats ∋ total 투자원금을 이용한 집계 #24
	;

	@Getter private Integer value;
	@Getter private String korean;
	
	public static AccountType of(Integer value) {
		if (value == null) {
			return null;
		}

		for (AccountType accountType : AccountType.values()) {
			if (value.intValue() == accountType.getValue().intValue()) {
				return accountType;
			}
		}
		return null;
	}
	
	public static AccountType of(String korean) {
		for (AccountType types : AccountType.values()) {
			if (types.korean.equalsIgnoreCase(korean)) {
				return types;
			}
		}
		int value = Integer.parseInt(korean, 10);
		return of(value);
	}

	private AccountType(Integer value, String korean) {
		this.value = value;
		this.korean = korean;
	}
	
}
