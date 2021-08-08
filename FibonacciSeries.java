package Week1.day1.assingments;

public class FibonacciSeries {

	public static void main(String[] args) {
	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
	int range = 6;
	int firstNum = 0;
	int secNum = 1;
	
	for (int i = 1;i < range;i ++)
	{
		int sum = firstNum + secNum;
		System.out.println(sum);
		firstNum  = secNum ;
		secNum =sum;
		
	}
	}
}
