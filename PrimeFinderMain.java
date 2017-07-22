import java.util.Scanner;
class PrimeFinder { 
static int remainder;
static boolean result;
static int count=0;
	public static boolean isPrime(int input) {
		int factor=0;
		for(int number=2;number<input;number++) {
			
			remainder=input%number;
			if(remainder==0) {
				factor++;
				break;
			}
		}
		if(factor==1) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void totalPrimeNo(int no1,int no2) {
		for(int number=no1;number<no2;number++) {
			result=isPrime(number);
			if(result) {
				count++;
			}
		}
		System.out.println("There are total "+count+" prime no between "+no1+" and "+no2);
	}
}



class PrimeFinderMain {
	static int input_no,first_no,second_no;
	static boolean result;
	public static void main(String[]args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a no to check prime");
	input_no=in.nextInt();
	result=PrimeFinder.isPrime(input_no);
	if(result) {
	System.out.println(input_no+" is a prime no");
	}
	else {
	System.out.println(input_no+" is not a prime no");
}   
    System.out.println("Enter the range:1st no and 2nd no");
	System.out.println("Enter first no");
	first_no=in.nextInt();
	System.out.println("Enter second no");
	second_no=in.nextInt();
	PrimeFinder.totalPrimeNo(first_no,second_no);
}
}