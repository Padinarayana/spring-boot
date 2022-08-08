package in.sunera.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import in.sunera.Controller.UserController;
import in.sunera.entity.User;
import in.sunera.repository.UserRepository;

public class TestUserController {

	private static UserRepository userMock;
	
	private static UserController userController;
	
	@BeforeAll
	public static void setUpOnce() {
 userMock=Mockito.mock(UserRepository.class);
		
		 userController=new UserController(userMock);
		
		 System.out.println(userMock.getClass()+"  "+Arrays.toString(userMock.getClass().getInterfaces()));
	}
	
	@AfterAll
	public static void clearOnce() {
		userMock=null;
		userController=null;
	}

	@Test
	public void findUserByWithValidInputs() {
		
		Mockito.when(userMock.findNameById(22)).thenReturn("raja1");
		
		assertEquals("raja1", userController.findByNameById(22));
	}
		
		
	@Test
	public void findUserByWithInValidInputs() {
		
//		Mockito.when(userMock.findNameById(-1)).thenReturn("raja1");
		
		assertThrows(IllegalArgumentException.class, ()->{
			userController.findByNameById(-1);
		});
	}
			
		
		
}
