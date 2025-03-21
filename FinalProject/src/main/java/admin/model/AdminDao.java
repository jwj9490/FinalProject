package admin.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDao {

	private final String namespace = "admin.model.Admin";
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	// ������ �߰�
	public int insertAdmin(AdminBean ab) {
		
		int cnt = sqlSessionTemplate.insert(namespace + ".insertAdmin", ab);
		System.out.println("ADAO insertAdmin cnt : " + cnt);
		return cnt;
	} // insertAdmin;

	// ������ �ѿ� 
	public int getTotalCount() {
		
		int totalCount = sqlSessionTemplate.selectOne(namespace + ".getTotalCount");
		System.out.println("ADAO getTotalCount : " + totalCount);
		return totalCount;
	} // getTotalCount;

	// ������ ����Ʈ �ҷ�����
	public List<AdminBean> getAllAdmin() {
		
		List<AdminBean> lists = sqlSessionTemplate.selectList(namespace + ".getAllAdmin");
		System.out.println("ADAO getAllAdmin size : " + lists.size());
		return lists;
	} // getAllAdmin;

	public AdminBean getAdmin(String username) {
		
		AdminBean AdminLogin = null;
		
		AdminLogin = sqlSessionTemplate.selectOne(namespace + ".getAdmin", username);
		System.out.println("ADAO login : " + AdminLogin);
		return AdminLogin;
	}
	
}
