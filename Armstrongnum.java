package Week1.day1.assingments;

public class Armstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int calculated = 0;
			int remainder = 0;
			int quotient = 0;
			int original = 153;
			int temp;
			{
				temp = original;
			while (temp >0)
			{
				
				remainder = temp % 10 ;
				System.out.println(remainder);
//				calculated = calculated + remainder ;
//				System.out.println(calculated);
				quotient =  temp /10;
				System.out.println(quotient);
				temp = quotient ;
				calculated = calculated +( remainder*remainder*remainder);
				System.out.println(calculated);
				
				
			}
			if ( calculated == original )
			{
				System.out.println("its an Armstrong");
				
			}
			else 
				System.out.println("its not Armstrong");
		}
			
	}

}
