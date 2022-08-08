package in.suenra.dao;

public  class UserDaoImpl implements UserDao {

	public String findNameById(Integer id) {
		
		System.out.println("UserDaoImpl.findNameById()");
		return "Jhon";
	}
	
	
public String findEmailById(Integer id) {
		System.out.println("UserDaoImpl.findEmailById()");
	return "john@gmail.com";
	}
}
