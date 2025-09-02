package basicSyntax;

public class MethodPractice {
	 public static void main(String[] args) {
		  int a = 10;
		  int b = 5;
		  
		  printResult("足し算", add(a, b));
		  printResult("引き算", subtract(a, b));
		  printResult("掛け算", multiply(a, b));
		  printResult("割り算", divide(a, b));
	 }
	 
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
	
	     public static void printResult(String operation, int result) {
	    	 System.out.println("計算結果は" + result + "です。");
	     }
	    
}