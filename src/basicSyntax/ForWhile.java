package basicSyntax;

public class ForWhile {

	public static void main(String[] args) {
		
		for (int num = 1; num <= 100; num++) {	
			if (num % 15 == 0 && num % 5 == 0) {
			   System.out.println("FizzBuzz");
		    } else if (num % 5 == 0) {
			   System.out.println("Buzz");
		    } else if (num % 3 == 0) {
			   System.out.println("Fizz");
		    } else {
			   System.out.println(num);
		  }
		}
		
		String[] langs = {"Ruby", "Going", "Java", "Python", "Typescript", "HTML", "Javascript"};
	    
	    for (String lang: langs) {
	    	if (lang.equals ("Java")) {
	    	System.out.println("現在学習中の言語はJavaです。");
	    	continue;
	        }else if (lang.equals ("HTML")){
	        System.out.println("HTMLはプログラム言語ではありません。");
	        break;
	        } else {
	        System.out.println(lang);
	        }
	}
}}
