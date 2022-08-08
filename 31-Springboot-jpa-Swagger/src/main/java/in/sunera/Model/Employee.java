package in.sunera.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "employee")
public class Employee {

	@ApiModelProperty(notes = "The employee generated Id")
	@SequenceGenerator(name = "EMP_SEQ", sequenceName = "EMP_SEQ", allocationSize=1)
	@GeneratedValue(generator = "EMP_SEQ", strategy = GenerationType.SEQUENCE)
	private long id;

	@ApiModelProperty(notes = "The employee first  name")
	private String firstName;

	@ApiModelProperty(notes = "The employee last name")
	private String lastName;

	@ApiModelProperty(notes = "The employee Email id")
	private String emailId;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstName, String lastName, String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
	}

	@Id
	@Column(name = "e_id")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email_id")
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
