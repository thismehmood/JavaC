// File Test.java
/* This class create Student class objects and demonstrates
 how to call various methods on objects
*/
public class Test{
public static void main (String args[]){
// Make two student obejcts 
Student s1 = new Student("ali", 15);
Student s2 = new Student(); //call to default costructor
s1.print(); // display ali and 15
System.out.println();
s2.print(); // display not set and 90
s2.setName("usman\n");
s2.setRollno(20);
//System.out.println("Student name:");	
System.out.println("\nsetname :" +s2.getName());
System.out.println("rollNo :" + s2.getRollno());
System.out.println("calling copy constructor");
Student s3 = new Student(s1); //call to copy constructor
 s2.print();
 s3.print();
 s3.setRollno(-10); //Roll No of s3 would be set to 100
 s3.print();
}
} //end of class 