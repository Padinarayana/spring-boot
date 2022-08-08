package in.suenra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import in.suenra.dao.UserDao;
import in.suenra.dao.UserService;

public class UserServiceTest {

	@Test
   public void testGetNameById() {
	   
	   UserDao mockDao=Mockito.mock(UserDao.class);
	   
	   Mockito.when(mockDao.findNameById(101)).thenReturn("raja");
	   
	   
	   UserService service=new UserService(mockDao);
	   
	   String name=service.getNameById(101);
	   assertEquals("raja", name);
   }
	
	@Test
	 public void testGetEmailById() {
		   
		   UserDao mockDao=Mockito.mock(UserDao.class);
		   
		   Mockito.when(mockDao.findEmailById(101)).thenReturn("raja@gmail.com");
		   
		   
		   UserService service=new UserService(mockDao);
		   
		   String email=service.getEmailById(101);
		   assertEquals("raja@gmail.com", email);
	   }
}
