import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	
	public static void main(String[] args) {
		Pattern p = Pattern.compile("<[A-za-z0-9]+>|</[A-za-z0-9]+>") ;
		Pattern p2 = Pattern.compile("\\$[0-9]{1,3}'[0-9]{3}(.[0-9]{3})*,[0-9]{2}") ;
		Pattern p3 = Pattern.compile("[0-9]{1,3}(.[0-9]{1,3}){3}") ;
		
		Matcher m = p.matcher("<html>");
		Matcher m2 = p2.matcher("$1'000.000.000,00");
		Matcher m3 = p3.matcher("4.4.4.4");
		if(m.matches())
			System.out.println("YES");
		if(m2.matches())
			System.out.println("YES2");
		if(m3.matches())
			System.out.println("YES3");
	}
}
