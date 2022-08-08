package in.sunera.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_dtls")
public class Student {

	@Id
	private Integer sid;
	private String sname;
	private String semail;
	private long sphno;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
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
	public long getSphno() {
		return sphno;
	}
	public void setSphno(long sphno) {
		this.sphno = sphno;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", semail=" + semail + ", sphno=" + sphno + "]";
	}
}
