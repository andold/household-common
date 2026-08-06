package kr.andold.household.domain;

import java.util.ArrayList;
import java.util.List;

import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
	private STATUS status;
	private T result;

	public static enum STATUS {
		SUCCESS("성공")
		, FAILURE("실패")
			, FAIL_NO_RESULT("결과없음")
			, FAIL_NO_DATA("데이터없음")
			, FAIL_MANY_DATA("데이터여러개")
		, EXCEPTION("예외")
		, NOT_SUPPORT("지원안함")
		, INVALID("무효")
		, ALEADY_DONE("한거다")
		, RESERVED("예약")
		;
		private String title;

		private STATUS(String string) {
			title = string;
		}

		public String get() {
			return title;
		}
	}

	@Builder
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class CrudList<Y> {
		private List<Y> creates;
		private List<Y> duplicates;
		private List<Y> updates;
		private List<Y> removes;

		public CrudList<Y> clear() {
			if (creates == null) {
				creates = new ArrayList<>();
			} else {
				creates.clear();
			}
			if (duplicates == null) {
				duplicates = new ArrayList<>();
			} else {
				duplicates.clear();
			}
			if (updates == null) {
				updates = new ArrayList<>();
			} else {
				updates.clear();
			}
			if (removes == null) {
				removes = new ArrayList<>();
			} else {
				removes.clear();
			}

			return this;
		}

		@Override
		public String toString() {
			return String.format("CrudList(+%d, =%d, ±%d, -%d)", Utility.size(creates), Utility.size(duplicates), Utility.size(updates), Utility.size(removes));
		}

		public void add(CrudList<Y> crud) {
			creates.addAll(crud.getCreates());
			duplicates.addAll(crud.getDuplicates());
			updates.addAll(crud.getUpdates());
			removes.addAll(crud.getRemoves());
		}

		public boolean isDirty() {
			return !creates.isEmpty() || !updates.isEmpty() || !removes.isEmpty();
		}
		
	}

}
