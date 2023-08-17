package dailyAssignment;

import java.util.Scanner;

public class NegativetoPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int negativeNumber;
		int PositiveNumber;
		
		Scanner sc = new Scanner (System.in);
		{
		
		System.out.println("enter a negative number");
		
		negativeNumber = sc.nextInt();
		if (negativeNumber<0){
		
		PositiveNumber = negativeNumber*(-1);
		System.out.println("positiveNumber:"+PositiveNumber);
		
		}
	
		else
		{
			
			System.out.println("Please enter a positivenumber");
		}
		
		}
	}
	
}
