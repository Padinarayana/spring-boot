package in.suenra.Service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class IsOddTest {

	@RepeatedTest(value=10,name="execution of {displayName}-{currentRepetition}/{totalRepetitions}")
	@DisplayName("testing data export")
	public void testExportData() {
	IsOdd service=new IsOdd();
	assertEquals("Data Exported", service.exportData());
	}
	
	
	
	
	@ParameterizedTest
	@ValueSource(ints= {23,21,9,5,77,88,34})
	public void testIsOdd(int n) {
		
		IsOdd service=new IsOdd();
		assertTrue(service.isOdd(n));
	}
	
//	@ParameterizedTest
//	@ValueSource(strings= {"raja","rani","bunny"})
//	@EmptySource
//	public void testSayHello(String name) {
//		IsOdd service=new IsOdd();
//		assertEquals("Hello"+name,service.sayHello(name));
//	}
	
	
//	@ParameterizedTest
////	@ValueSource(strings= {""," ","b"})
////	@EmptySource
////	@NullSource
//	@NullAndEmptySource
//	public void testSayHello(String name) {
//		IsOdd service=new IsOdd();
//		Assertions.assertTrue(service.isEmpty(name));
//	}
	
		
	}

