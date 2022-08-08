package in.suenra.dao;

public class UserService {

	private UserDao dao;
	
	public UserService() {
		// TODO Auto-generated constructor stub
	}

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	
	public String getNameById(Integer id) {
		String name=dao.findNameById(id);
		return name;
	}
	
	
	public String getEmailById(Integer id) {
		String mail=dao.findEmailById(id);
		return mail;
	}
	
	
}
