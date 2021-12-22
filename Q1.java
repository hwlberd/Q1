import java.util.Scanner;
import java.lang.Math;
public class Q1 {

	
	public static void Calculator() {
		Scanner scanner = new Scanner(System.in);
		char option;
		
		do {
			
			int num1;
			int num2;
			
			int result;
			System.out.println("Select Operation:");
			System.out.println("1:Addition");
			System.out.println("2:Subtraction");
			System.out.println("3:Multiplication");
			System.out.println("4:Division");
			System.out.println("5:Remainder");
			System.out.println("6:Power");
			System.out.println("7:Exit");
			
			System.out.println("Enter a choice: ");
			
			option=scanner.next().charAt(0);
			
			
			switch(option) {
			
			case 'a' :
				System.out.println("Please enter first number :");
				num1=scanner.nextInt();
				System.out.println("Please enter second number :");
				num2=scanner.nextInt();
				result=num1+num2;
				System.out.println("Result of "+num1+ "+"+num2+":"+result);
				System.out.println("");
				break;
				
			case 's' :
				System.out.println("Please enter first number :");
				num1=scanner.nextInt();
				System.out.println("Please enter second number :");
				num2=scanner.nextInt();
				result=num1-num2;
				System.out.println("Result of "+num1+ "-"+num2+":"+result);
				System.out.println("");
				break;	
			case 'm' :
				System.out.println("Please enter first number :");
				num1=scanner.nextInt();
				System.out.println("Please enter second number :");
				num2=scanner.nextInt();
				result=num1*num2;
				System.out.println("Result of "+num1+ "*"+num2+":"+result);
				System.out.println("");
				break;	
			case 'd' :
				System.out.println("Please enter first number :");
				num1=scanner.nextInt();
				System.out.println("Please enter second number :");
				num2=scanner.nextInt();
				result=num1/num2;
				System.out.println("Result of "+num1+ "/"+num2+":"+result);
				System.out.println("");
				break;	
			case 'r' :
				System.out.println("Please enter first number :");
				num1=scanner.nextInt();
				System.out.println("Please enter second number :");
				num2=scanner.nextInt();
				result=num1%num2;
				System.out.println("Result of "+num1+ "%"+num2+":"+result);
				System.out.println("");
				break;	
			case 'p' :
				System.out.println("Please enter first number :");
				num1=scanner.nextInt();
				System.out.println("Please enter second number :");
				num2=scanner.nextInt();
				result=(int) Math.pow(num1,num2);
				System.out.println("Result of "+num1+ "-"+num2+":"+result);
				System.out.println("");
				break;	
				
			default:
				System.out.println("Wrong input");
				break;
		
			}
			
			
			
			if(option=='6') {
				break;
			}
		}while(option!='6');
		
		scanner.close();
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Calculator();
		
		
	}

}


