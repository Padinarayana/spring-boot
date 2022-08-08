package in.suenra.Service;

public class IsOdd {
	
	
	public String exportData() {
		return "Data Exported";
	}

	public boolean isOdd(int n) {
		if(n%2==0)
			return false;
		else
			return true;
	}
	
	public String sayHello(String name) {
		return "Hello"+name;
	}
	
	public boolean isEmpty(String name) {
		return name.isBlank();
	}
}
