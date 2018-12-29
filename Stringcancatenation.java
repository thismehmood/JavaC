public class Stringcancatenation{
  public static void main(String[] Args){
	int i = 90;
	int j = 180;
	System.out.println("calculation"+i);
	System.out.println(i+j);
	String s1 = new String("Hello everyone");
	String s2 = "Hello everyone";
	if(s1==s2){
		System.out.println("comaprison string using == operator");
	}
	if(s1.equals (s2)){
		System.out.println("comaprison string using equal method");	
	}
   }
}