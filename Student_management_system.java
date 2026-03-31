

	interface GradeCalculation {
	    char calculateGrade();
	}

	
	class Person {
	    protected String name;
	    protected int age;
	    protected int id;

	    
	    Person(String name, int age, int id) {
	        this.name = name;
	        this.age = age;
	        this.id = id;
	    }

	  
	    public void displayPersonDetails() {
	        System.out.println("Name : " + name);
	        System.out.println("Age  : " + age);
	        System.out.println("ID   : " + id);
	    }
	}

	
	class Student extends Person implements GradeCalculation {
	    private int rollNumber;
	    private int marks;

	    Student(String name, int age, int id, int rollNumber, int marks) {
	        super(name, age, id);
	        this.rollNumber = rollNumber;
	        this.marks = marks;
	    }

	    
	   
	    public char calculateGrade() {
	        if (marks >= 90)
	            return 'A';
	        else if (marks >= 75)
	            return 'B';
	        else if (marks >= 50)
	            return 'C';
	        else
	            return 'F';
	    }

	 
	    public void displayStudentDetails() {
	        displayPersonDetails();  
	        System.out.println("Roll Number : " + rollNumber);
	        System.out.println("Marks       : " + marks);
	        System.out.println("Grade       : " + calculateGrade());
	    }
	}


	public class StudentManagementSystem {
	    public static void main(String[] args) {

	       
	        Student student1 = new Student("Sri", 18, 1001, 21, 85);

	       
	        student1.displayStudentDetails();
	    }
	}


