// File Test.java
public class Test{
public static void main (String args[]){ int numObjs;
// printing current number of objects i.e 0
numObjs = Student.getCountStudents();
System.out.println(“Students Objects” + numObjs);
// Creating first student object & printing its values
Student s1 = new Student("ali", 15);
System.out.println(“Student: ” + s1.toString());
// printing current number of objects i.e. 1
numObjs = Student.getCountStudents();
System.out.println(“Students Objects” + numObjs);
// Creating second student object & printing its values
Student s2 = new Student("usman", 49);
// implicit call to toString() method
System.out.println(“Student: ” + s2);
// printing current number of objects i.e. 2
numObjs = Student.getCountStudents();
System.out.println(“Students Objects” + numObjs);
// loosing object reference
s1 = null;
// requesting JVM to run Garbage collector but there is
 // no guarantee that it will run
System.gc();
// printing current number of objects i.e. unpredictable
numObjs = Student.getCountStudents();
System.out.println(“Students Objects” + numObjs);
} //end of main
} //end of class 