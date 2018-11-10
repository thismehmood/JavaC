public class Student{
   public String name;
   public int rollno;
   // standard setter
   public void setName(String name){
      this.name = name;
   }
   //not masking of class level variable rollno
   public void setRollno(int rollno){
         if(rollno > 0){
         	this.rollno=rollno;
         }
         else{
         	this.rollno=90;
         }
   }
   //standard getter
    public String getName(){
    	return name;
    }
    public int getRollno(){
    	return rollno;
    }
    //default contructor
    public 	Student(){
    	name =  "not set";
    	rollno = 90;
    }
    //parametrized constructor called
    public Student( String name, int rollno){
    		setName(name);
    		setRollno(rollno);
    	}
//cpy contructor called
    	public Student(Student s){
           name=s.name;
           rollno=s.rollno;
    	}
    	// method used to diplay on console 
    public void print(){
    	System.out.print("Student name :" +name);
    	System.out.print(", rollno :" +rollno);
    }
}	//end class
	