package lifeName;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		lifeName lifeName= new lifeName();
//		lifeName.creat();
//		
//		 File file = new File("D:/course.txt");
//	     System.out.println(lifeName.txt_String(file));
		String a="love23next234csdn3423javaeye";
		String regEx="[^0-9]";  
		Pattern p = Pattern.compile(regEx);  
		Matcher m = p.matcher(a);  
		System.out.println( m.replaceAll(" ").trim());
		}
}
