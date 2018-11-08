import javax.swing.*;
public class InputOutputTest{
  public static void main( String[] args){
  	 //take input through GUI
  	String input= JOptionPane.showInputDialog("Enter Number here");
  	int Number= Integer.parseInt(input);
  	int square= Number*Number;
  	//Display sqaure on console
  	System.out.println("square" + square);
  	//Display sqaure on GUI
  	JOptionPane.showMessageDialog(null,"square:" + square);
  	System.exit(0);
  }
}