package in.sunera.binding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DTLS")
public class Student {
	
	@Id
	@Column
	private int sid;

	private String sname;
	
	private String semail;
	
	private int sphno;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSemail() {
		return semail;
	}
	public void setSemail(String semail) {
		this.semail = semail;
	}
	public int getPhno() {
		return sphno;
	}
	public void setPhno(int phno) {
		this.sphno = phno;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", phno=" + sphno + "]";
	}
	public Student(int sid, String sname, String semail, int sphno) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.sphno = sphno;
	}
	public Student() {
		
	}
}