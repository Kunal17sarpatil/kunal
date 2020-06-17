import java.util.*;

class Calculator {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No1 = ");
		int no1 = sc.nextInt();
		System.out.print("Enter No2 = ");
		int no2 = sc.nextInt();
		System.out.print("Enter Operator = ");
		char op = sc.next().charAt(0);
		int add,sub,mul,div;

		if(op=='+') {
		
			add = no1+no2;
			System.out.println("Addition of "+no1+" and "+no2+" = "+add);
		} else if(op=='-') {
		
			sub = no1-no2;
			System.out.println("Substraction of "+no1+" and "+no2+" = "+sub);
		} else if(op=='*') {
		
			mul = no1*no2;
			System.out.println("Multiplication of "+no1+" and "+no2+" = "+mul);
		} else if(op=='/') {
		
			div = no1/no2;
			System.out.println("Division of "+no1+" and "+no2+" = "+div);
		}

	}
}
