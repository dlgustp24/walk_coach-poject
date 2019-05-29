package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	
	public MyDao() {
		System.out.println("dao 객체 생성!");
	}
	public List<String> selectList(){
		// DB 조회했다고 가정..
		List<String> list = new ArrayList<String>();
		list.add("피카츄");
		list.add("라이츄");
		list.add("파이리");
		list.add("꼬부기");
		return list;
	}
}
