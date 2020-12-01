
public class Student {
String name ;
String email ;
String phone;
String faculty ;
Grade [] grades;

public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getFaculty() {
	return faculty;
}
public void setFaculty(String faculty) {
	this.faculty = faculty;
}
public Grade[] getGrades() {
	return grades;
}
public void setGrades(Grade[] grades) {
	this.grades = grades;
}


public Student(String name, String email, String phone, String faculty) {
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.faculty = faculty;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
	
}

 
 

