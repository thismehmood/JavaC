import java.util.*;
public class HashMapTest {
public static void main(String[] args) {
// creating HashMap object
HashMap h= new HashMap<String, Student> 
HashMap h=new HashMap<String, Student>();
// creating Student objects
Student s1 = new Student ("ali" , 1);
Student s2 = new Student ("saad" , 2);
Student s3 = new Student ("raza" , 6);
// adding elements (Student objects) where roll nos
// are stored as keys and student objects as values
h.put("one". S1);
h.put("two". S2);
h.put("three". S3);
// checking whether hashmap is empty or not
 boolean b = h.isEmpty ();
if (b == true) {
System.out.println("hashmap is empty"); 
} 
else {
int size = h.size();
System.out.println("hashmap size: " + size);
}
// retrieving student object against rollno two and
// performing downcasting
Student s = (Student) h.get("two");
// calling student’s class print method
s.print();
} // end main
}// end class