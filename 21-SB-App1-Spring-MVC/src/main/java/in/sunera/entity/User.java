package in.sunera.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="user_dtls")
public class User {

	@SequenceGenerator(name = "s_id_seq", sequenceName = "student_id_seq", allocationSize=1)
	@GeneratedValue(generator = "s_id_seq", strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name="userid")
	private int userid;
	
	
	@Column(name="uname")
	private String username;
	
	@Column(name="pwd")	
	private String Password;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phno")
	private Long phno;

	public User(int i, String string, String string2, int j) {
		// TODO Auto-generated constructor stub
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", Password=" + Password + ", email=" + email
				+ ", phno=" + phno + "]";
	}
	

	
	
}
