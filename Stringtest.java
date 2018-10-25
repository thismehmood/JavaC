public class stringtest{
	public static void main() {
		int i=4;
		int j=7;

		System.out.println("Hey" + i);
		System.out.println(i + j);
		string s1= new string("Hey johns");
		string s2= "Hey johns";
		if(s1=s2){
		 System.out.println("comparing the string using == operator");
		}
		if(s1.equal(s2)){
		 System.out.println("not sure");
		}
	}
}