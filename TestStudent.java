import javax.swing.JOptionPane;

public class TestStudent {
	static int total;
	public static void main(String[] args){
		
		
    String studentnumbers= JOptionPane.showInputDialog("Enter Numbers of Student :");
    int numbersOfStudent =Integer.parseInt(studentnumbers);
     
        Student [] students = new Student [numbersOfStudent];
		
      
		for(int i=0; i< numbersOfStudent;i++){
			
		    String name= JOptionPane.showInputDialog("Enter Name of Student :");
			String email= JOptionPane.showInputDialog("Enter Email of Student :");
		    String phone = JOptionPane.showInputDialog("Enter Phone of Student :");
			String faculty= JOptionPane.showInputDialog("Enter Faculty of Student :");
			
			Student s1 = new Student(name,email,phone,faculty);
		
		    String subjectnumbers= JOptionPane.showInputDialog("Enter Numbers of subjects :");
		    int numbersOfSubjects =Integer.parseInt(subjectnumbers);
		     total=+numbersOfSubjects;
			
			Grade [] grades = new Grade [numbersOfSubjects];
			for(int j=0; j< numbersOfSubjects;j++){
			
				 String subjectname= JOptionPane.showInputDialog("Enter Name of Subject :");
				 String subjectgrade= JOptionPane.showInputDialog("Enter grade of subject :");
				 int gradeOfSubject =Integer.parseInt(subjectnumbers);
				 
			Grade grade = new Grade(subjectname,gradeOfSubject);
			grades[j]=grade;
			}
			s1.setGrades(grades);
			
			students[i]=s1;
		}
		
		String result="";
		/*Grade[] compare= new Grade[total];
		//Grade compare1= new Grade(students[0].getGrades()[0].getName(),students[0].getGrades()[0].getMark());
		compare [0]= new Grade(students[0].getGrades()[0].getName(),students[0].getGrades()[0].getMark());
		String studentname=students[0].getName();*/
		
		for(int i=0; i< students.length;i++){
			
			
		result+="Student Name is "+students[i].getName()+"\n"+"Student Email is "+students[i].getEmail()+"\n"+"Student faculty is "+students[i].getFaculty()+"\n"+"Student Phone is"+students[i].getPhone()+"\n";
		result+="****************************************\n";
		
		for(int j=0; j< students[i].getGrades().length;j++){
			result+="subject name is:   "+students[i].getGrades()[j].getName()+"\n"+"subject grade is:   "+students[i].getGrades()[j].getMark()+"\n";
			result+="_____________________________\n";
			
			/*for(int k=0;k<total;k++){
				
		/*	if(students[i].getGrades()[j].getName().equals(compare[k].getName()) && students[i].getGrades()[j].getMark()>compare[k].getMark())
				compare[k].setMark(students[i].getGrades()[j].getMark());
			
			else if (students[i].getGrades()[j].getName()!=compare[k].getName() && compare[k].getName()!=null)
				compare[k].setName(students[i].getGrades()[j].getName());
			    compare[k].setMark(students[i].getGrades()[j].getMark());
		}
		}*/
		
		}
		
		//result+="Nmbers of students="+ students.length+"___________\n";
		//for(int k=0;k<total;k++){
			//result+= "   "+compare[k].getName()+"    "+compare[k].getMark()+"\n";
		//}
		}
		JOptionPane.showMessageDialog(null, result);
		
	}
}

