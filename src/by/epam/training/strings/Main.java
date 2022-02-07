package by.epam.training.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		
		
		
		
//		Pattern p = Pattern.compile("J2SE");
//		
//		String candidateString_1 = "J2SE is the only one for me";
//		String candidateString_2 = "For me, it's J2SE, or nothing at all";
//		
//		Matcher matcher = p.matcher(candidateString_1);
//		System.out.println(matcher.lookingAt());
//		
//		matcher.reset(candidateString_2);
//		System.out.println(matcher.lookingAt());

//	Pattern p = Pattern.compile("J(\\w*)", Pattern.CASE_INSENSITIVE);
//	
//	String text = "Java is fun; JavaScript is funny.; JFunny ; just";
//	
//	Matcher m = p.matcher(text);
//	while (m.find()) {
//		System.out.println("Found '" + m.group(0) + "' at position " + m.start(0) + "-" +m.end(0));
//		System.out.println("Suffix is " +m.group(1));
//	}
		task1();
		task2();
		task3();
		task4();
		task5();
		task6();
		task7();
		task8();
		task9();
		task10();
		task11();
		task12();
		task13();
		task14();
		
		
	
		
		
	}
	
	public static void task1() {
		Pattern p = Pattern.compile("a.b");
		String text = "ahb acb aeb aeeb adcb axeb";
		Matcher m = p.matcher(text);
		while (m.find()) {
		 System.out.println(m.group(0));	
		}
	}
	
	public static void task2() {
		Pattern p = Pattern.compile("a..a");
		String text = "aba aca aea abba adca abea";
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	
	public static void task3() {
		Pattern p = Pattern.compile("ab.a");
		String text = "aba aca aea abba adca abea";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	public static void task4() {
		Pattern p = Pattern.compile("ab+a");
		String text = "aa aba abba abbba abca abea";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	
	public static void task5() {
		Pattern p = Pattern.compile("ab*a");
		String text = "aa aba abba abbba abca abea";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	public static void task6() {
		Pattern p = Pattern.compile("ab?a");
		String text = "aa aba abba abbba abca abea";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	public static void task7() {
		Pattern p = Pattern.compile("ab*a");
		String text = "aa aba abba abbba abca abea";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	public static void task8() {
		Pattern p = Pattern.compile("(ab)+(\\w*)");
		String text = "ab abab abab abababab abea";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	public static void task9() {
		Pattern p = Pattern.compile("a\\.a");
		String text = "a.a aba aea";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	public static void task10() {
		Pattern p = Pattern.compile("2\\+3");
		String text = "2+3 223 2223";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	public static void task11() {
		Pattern p = Pattern.compile("2\\++3");
		String text = "23 2+3 2++3 2+++3 345 567";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	public static void task12() {
		Pattern p = Pattern.compile("2\\+*3");
		String text = "23 2+3 2++3 2+++3 445 677";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	public static void task13() {
		Pattern p = Pattern.compile("\\*q+\\+");
		String text = "*+ *q+ *qq+ *qqq+ *qqq qqq+";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group());
        }
	}
	public static void task14() {
		Pattern p = Pattern.compile("a\\w+?a");
		String text = "aba accca azzza wwwwa";
		
		Matcher m = p.matcher(text);
		while (m.find()) {
            System.out.println(m.group().replaceAll("a", "!"));
        }
	}

}
