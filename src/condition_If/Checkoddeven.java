package condition_If;

public class Checkoddeven {
	public void checkOddOrEven(int num) {
		if( num%2==0){
		System.out.println("Given number is Even Number");
	}
		if ( num%2==1){
		System.out.println("Given Number is Odd Number");
		}
	}
	public static void main(String[] args) {
		
		new Checkoddeven().checkOddOrEven(24);
		
	}
}
