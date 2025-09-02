package basicSyntax;

public class MethodPractice {
	 
		 public static int add(int c, int d) {
			 return c + d;
		 }
		 public static int subtract(int c, int d) {
			 return c - d;
		 }
		 public static int multiply(int c, int d) {
			 return c * d;
		 }
		 public static int divide(int c, int d) {
			 return c / d;
		 }
		 public static void main(String[] args) {
			  int a = 10;
			  int b = 5;
		
	     String x = "計算結果は";
	     String y = "です。";
	     
	     System.out.println(x + add(a, b) + y);
	     System.out.println(x + subtract(a, b) + y);
	     System.out.println(x + multiply(a, b) + y);
	     System.out.println(x + divide(a, b) + y);
	}
}