package ddit.chap08.sec01;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
		System.out.println("select * from prod");
	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
		System.out.println("insert into cart values(?,?,?,?)"); //사용자가 데이터를 4개 입력받아야함
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");
		System.out.println("update buyprod set buy_qty=? where buy_prod='P1010001'");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
		System.out.println("delete from member where mem_id=?");
		
	}
	
}
