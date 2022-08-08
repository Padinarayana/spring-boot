package in.suenra.Service;

public class BankLoanService {

	
 public float CalcIntrest(float pmAct ,float rate,float time) {
	 
	 
	 
	 if(pmAct<=0 &&rate<=0 &&time<=0)
		 throw new IllegalArgumentException("Invalid Inputs.");
//	System.out.println("BankLoanService.CalcIntrest()");
//	 try {
//		 Thread.sleep(30000);
//	 }
//	 catch(Exception e) {
//	 e.printStackTrace();
//	 }
	return (pmAct*rate*time)/100;
	 	 
 }
}
