class Person{ // Parent Class
    String name;
    int ID;
    Person(String name, int ID){ //Constructor
        this.name = name;
        this. ID = ID;
    }
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + ID);
    }
}
class Student extends Person{ // Child Class
    int gradeLevel;
    Student(String name, int ID,int gradeLevel){ //Constructor
        super(name,ID);
        this.gradeLevel = gradeLevel;
    }
    void markAttendance() {
        System.out.println(name + " (Student - Grade " + gradeLevel + ") is present.");
    }
}
class Teacher extends Person{
    String subject;
    Teacher(String name, int ID, String subject){
        super(name,ID);
        this.subject = subject;
    }
    void markAttendance() {
        System.out.println(name + " (Teacher - " + subject + ") is present.");
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        Student student1 = new Student("Ali", 101, 10);
        student1.displayInfo();
        student1.markAttendance();
        System.out.println();
        Teacher teacher1 = new Teacher("Ms. Ayesha", 201, "Mathematics");
        teacher1.displayInfo();
        teacher1.markAttendance();
    }
}
