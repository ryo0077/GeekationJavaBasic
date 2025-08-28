package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
	   int a = 100;
	   int b = 10;
	   
	   boolean isSunny = true;
	   boolean isWarm = true;
	   
	   int x = 5;
	   int y = 10;
	   
	   boolean isGreaterA = (a > b);
	   boolean weather = (isSunny && isWarm);
	   boolean andResult = (x >= 0) && (y % 2 == 0);
	   boolean hasPermisson = false;
	   
	   
	   System.out.println(isGreaterA);
	   System.out.println(weather);
	   System.out.println(andResult);
	   System.out.println(!hasPermisson);

	}

}
