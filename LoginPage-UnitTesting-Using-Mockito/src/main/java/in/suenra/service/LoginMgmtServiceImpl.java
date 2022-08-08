package in.suenra.service;

import in.suenra.dao.LoginDao;

public class LoginMgmtServiceImpl implements ILoginMgmtService {

	private LoginDao loginDao;
	
	
	public LoginMgmtServiceImpl(LoginDao loginDAO) {
  this.loginDao=loginDAO;
	}
	
	@Override
	public boolean login(String username, String password) {

		if(username.equals("")||password.equals(""))
			throw new IllegalArgumentException("Empty Credentials");
		
		int count=loginDao.authenticate(username,password);
		if(count==0)
			return false;
		else
			return true;
		
	
	}
}
