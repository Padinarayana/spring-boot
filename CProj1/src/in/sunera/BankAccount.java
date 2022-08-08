package in.sunera;

public class BankAccount {

	private static String bName = "SBI";
	private long AcId;
	private String AccHolderName;
	private String IFSC;
	private long MobileNo;
	private float balance;
	

	public BankAccount(long acId, String accHolderName, String iFSC, long mobileNo, float balance) {
		super();
		AcId = acId;
		AccHolderName = accHolderName;
		IFSC = iFSC;
		MobileNo = mobileNo;
		this.balance = balance;
	}

	
	@Override
	public String toString() {
		return "BankAccount [bName="+bName+ ", AcId=" + AcId + ", AccHolderName=" + AccHolderName + ", IFSC=" + IFSC + ", MobileNo="
				+ MobileNo + ", balance=" + balance+" ]";
	}


	public void deposit(float Amt) {
		System.out.println("before deposit"+balance);
		balance = balance + Amt;
		System.out.println("after deposit"+balance);

	}

	public void withdraw(float Amt) {
		System.out.println("Before withdraw"+balance);

		balance = balance - Amt;

	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(123412, "raja", "SBIN000123", 9845344213L, 2000.0f);
		b1.withdraw(1000);
		System.out.println(b1.balance);
		b1.deposit(3000);
     System.out.println(b1);
	}
}
