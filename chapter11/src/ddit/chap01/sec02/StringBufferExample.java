//String class는 생성되면 내용 수정이 불가능(immutable class)
//' '+'연산자로 결합할 때 많은 공간이 소요됨'
// => StringBuffer class 독립된 Buffer 공간 사용으로 내용 변경(mutable class)과 데이터 추가시 
// 별도의 공간이 빌요 없고 처리 속도가 빠름
// (주요 메서드)
// append() - 꽁무늬에 자료 추가
// capacity() - 버퍼크기 반환(기본 16) 변경시킬 수 있음
// delete()
// insert() - 특정위치(index)에 데이터 저장
// toString{} - 문자열 클래스 타입으로 변환

package ddit.chap01.sec02;

public class StringBufferExample {
	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("select a.cart_prod as aprod, ");
		sb.append(" sum(a.cart_qty * b.prod_price as asum ");
		//b.prode_price 뒤에 괄호가 있어야하는데 크키가 아직 정해지지 않아서 넣지 못함.
		sb.append(" sum(a.cart_qty) as aqty ");
		sb.append(" from cart a, prod b ");
		sb.append(" where a.cart_no between ? and ? ");
		sb.append(" 	and a.cart_prod = b.prod_id ");
		sb.append(" group by a.cart_prod ");
		System.out.println(sb);
		sb.insert(59, ")");
		//앞뒤에 공백 넣는 습관을 들여 오류를 없애기,,
		//제품별 판매 분석 자료 구하는 것임,,
		
		String sql=sb.toString(); //반드시 toString 메소드로 재정의 되어져야함
		
		System.out.println(sql);
	}
}
