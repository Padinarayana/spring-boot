package in.suenra.Service;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Testing with Loan Service")
@TestMethodOrder(value = OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.DisplayName.class)
public class TestBankLoanService {

	private static BankLoanService service;
	
	
	@BeforeAll
	public static void setUpOnce() {
		System.out.println("TestBankLoanService.setUpOnce()");
		service=new BankLoanService();
	}
/*	@BeforeEach
	public void setUp() {
		System.out.println("TestBankLoanService.setUp()");
		 service=new BankLoanService();		
		
	}*/

	@Test
	@DisplayName("Testing with Big Numbers")
//	@Order(2)
	@Tag("dev")
	public void testCalcSimpleIntrestWithBigNumbers() {
		System.out.println("TestBankLoanService.testCalcSimpleIntrestWithBigNumbers()");
		float actual=service.CalcIntrest(200000000, 2, 2);
//		System.out.println(actual);
		float expected=8000000;
		assertEquals(actual, expected);
	}
	
	
	@Test
	@DisplayName("Testing with Small Numbers")
//	@Order(-10)
	@Tag("dev")
	@Tag("uat")
	public void testCalcSimpleIntrestWithSmallNumbers() {

		System.out.println("TestBankLoanService.testCalcSimpleIntrestWithSmallNumbers()");
		float actual=service.CalcIntrest(2000, 1, 2);
//		System.out.println(actual);
		float expected=40.12f;
		assertEquals(actual, expected,0.5,"Result not matched.");
	}
	
	
	
	@Test
	@Tag("uat")
	public void testCalcSimpleIntrestWithInvalidInputs() {
		BankLoanService service=new BankLoanService();
		assertThrows(IllegalArgumentException.class, 
				()->service.CalcIntrest(0,0,0)); 
		
	}
	

	
	@Test
	@Tag("uat")
	@Disabled
	public void testCalcSimpleIntrestWithTimer() {
	System.out.println("TestBankLoanService.testCalcSimpleIntrestWithTimer()");
		assertTimeout(Duration.ofMillis(10000), ()->
		{
			service.CalcIntrest(300000, 2, 2);
		});
	}
	
	
	
	@Test
	@Tag("uat")
	public void testCalcSimpleIntrestWithNoException(TestInfo info) {
System.out.println("TestBankLoanService.testCalcSimpleIntrestWithNoException()");
System.out.println(info.getClass()+"   "+info.getTags()+"  "+info.getDisplayName()+"  "+info.getTestMethod().get().getName());
		assertDoesNotThrow(()->{
			service.CalcIntrest(30000, 2, 12);
		});
	}
	
	
/*	@AfterEach
		public void clear() {
			System.out.println("TestBankLoanService.clear()");
			service=null;
			
		}*/
	
	@AfterAll
	public static void clearOnce() {
		System.out.println("TestBankLoanService.clearOnce()");
		service=null;
		
	}
		
	}

