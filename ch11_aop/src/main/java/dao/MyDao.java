package dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class MyDao {
	
	public MyDao() {
		System.out.println("dao ��ü ����!");
	}
	public List<String> selectList(){
		// DB ��ȸ�ߴٰ� ����..
		List<String> list = new ArrayList<String>();
		list.add("��ī��");
		list.add("������");
		list.add("���̸�");
		list.add("���α�");
		return list;
	}
}
