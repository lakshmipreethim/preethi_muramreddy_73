import java.util.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
public class Main {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd");
		ArrayList<Student> sg=new ArrayList<student>();
		Student student=new Student(1001,"preethi",sdf.parse("06-09-2017"),75.00);
Student student1=new Student(1001,"preethi",sdf.parse("06-09-2017"),75.00);
Student student2=new Student(1001,"preethi",sdf.parse("06-09-2017"),75.00);
Student student3=new Student(1001,"preethi",sdf.parse("06-09-2017"),80.00);
sg.add(student);
sg.add(student1);
sg.add(student2);
sg.toArray();
StudentGroup sgb=new StudentGroup(sg.size());
sgb.add(sg.get(0),0);
sgb.add(sg.get(1),1);
sgb.add(sg.get(2),2);

System.out.println(sg.getStudents());
sg.remove(2);
sg.add(student3);
sgb.add(sg.get(2),2);
System.out.println(sg.getStudents());

		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
