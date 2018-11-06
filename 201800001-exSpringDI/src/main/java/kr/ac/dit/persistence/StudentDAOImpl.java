package kr.ac.dit.persistence;
import org.springframework.stereotype.Repository;
@Repository //이클래스는 데이터베이스 입출력코드들이 들어있는곳
public class StudentDAOImpl implements StudentDAO {
	public void studentInsert() {
		System.out.println("Spring DI pattern~!");
	}
}
