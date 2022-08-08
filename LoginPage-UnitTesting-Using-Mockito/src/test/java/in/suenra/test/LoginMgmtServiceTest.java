package in.suenra.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import in.suenra.dao.LoginDao;
import in.suenra.service.ILoginMgmtService;
import in.suenra.service.LoginMgmtServiceImpl;

public class LoginMgmtServiceTest {

	private static ILoginMgmtService loginService;
	
	private static LoginDao loginDaoMOCK;
	
	@BeforeAll
	public static void setUp() {
		loginDaoMOCK=Mockito.mock(LoginDao.class);
		
		loginService=new LoginMgmtServiceImpl(loginDaoMOCK);
	}
	
	@AfterAll
	public static void clearOnce() {
		
		loginService=null;
		loginDaoMOCK=null;
	}
	
	@Test
	public void testLoginWithValidCredentials() {
		Mockito.when(loginDaoMOCK.authenticate("raja", "rani")).thenReturn(1);
		
	  assertTrue(loginService.login("raja", "rani"));
	}
	
	
	@Test
	public void testLoginWithInValidCredentials() {
		Mockito.when(loginDaoMOCK.authenticate("raja", "rani")).thenReturn(0);
		
	  assertFalse(loginService.login("raja", "rani1"));
	}
	
	
	@Test
	public void testLoginWithNoCredentials() {
		assertThrows(IllegalArgumentException.class, ()->{
			loginService.login("", "");
		});
	}
}
