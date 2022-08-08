package in.sunera.Marshalling;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import in.sunera.Student;

public class Marshalling {

	public static void main(String[] args) throws JAXBException {
		Student student=new Student();
	    student.setStudentId(111);
	    student.setStudentName("Raja");
	    student.setStudentAge(25);
	    student.setStudentRank(89);
	    
	    JAXBContext context=JAXBContext.newInstance(Student.class);
	    Marshaller marshaller=context.createMarshaller();
	    marshaller.marshal(student, System.out);
	}
	
}
