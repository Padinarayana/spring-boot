package in.sunera;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private Integer studentId;
	private String studentName;
	private Integer studentAge;
	private Integer studentRank;
	
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(Integer studentAge) {
		this.studentAge = studentAge;
	}
	public Integer getStudentRank() {
		return studentRank;
	}
	public void setStudentRank(Integer studentRank) {
		this.studentRank = studentRank;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentRank=" + studentRank + "]";
	}
	
	
}
