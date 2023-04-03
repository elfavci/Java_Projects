import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int num1,num2,value;
		System.out.println("enter a transaction number (addition:1,substraction:2,multiplication:3,division:4) :");
		value=inp.nextInt();
		
		switch (value) {
		case 1: System.out.println("Addition selected");
				System.out.println("enter first number");		
				num1=inp.nextInt();
				System.out.println("enter second number");
				num2=inp.nextInt();
		        System.out.println("Addition result = "+ (num1+num2));
				break;
		case 2: System.out.println("Subtraction selected");
			    System.out.println("enter first number");		
			    num1=inp.nextInt();
			    System.out.println("enter second number");
			    num2=inp.nextInt();
			   if(num1>=num2) {
				   System.out.println("Subtraction result = "+(num1-num2));
			   }
			   else{
				   System.out.println("Subtraction result = "+(num2-num1));
			   }
			   break;
		case 3: System.out.println("Multiplication selected");
				System.out.println("enter first number");		
				num1=inp.nextInt();
				System.out.println("enter second number");
				num2=inp.nextInt();
			   System.out.println("Multiplication result = "+(num1*num2));
			   break;
		case 4: System.out.println("Division selected");
				System.out.println("enter first number");		
				num1=inp.nextInt();
				System.out.println("enter second number");
				num2=inp.nextInt();
			   if(num1!=0 && num2!=0) {
				   if(num1>=num2) {
					   System.out.println("Division result = "+(num1/num2));
				   }
				   else {
					   System.out.println("Division result = "+(num2/num1));
				   }
			   }
			   else {
				   System.out.println("Error");
			   }
			   break;
			   default:System.out.println("out of range");
		}
		inp.close();
	}

}


