package ddit.chap08.sec01;

public class DaoExample {

	public static void main(String[] args) {
		dbWork(new OracleDao()); //updating 되어짐
		dbWork(new MySqlDao());
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.delete();
		dao.insert();
		dao.update();
	}
	
}
