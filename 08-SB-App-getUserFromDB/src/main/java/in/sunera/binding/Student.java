package in.sunera.binding;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_DTLS")
public class Student {
	
	@Id
	private int sid;
	private String sname;
	private String semail;
	private Long sphno;
	
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
	public Long getSphno() {
		return sphno;
	}
	public void setSphno(Long sphno) {
		this.sphno = sphno;
	}
	public Student(int sid, String sname, String semail, Long sphno) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.sphno = sphno;
	}
	public Student() {
		super();
	}
	
	

}
