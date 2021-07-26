package basicPrograms;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexBasics {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("[A-Z]");
		Matcher m = p.matcher("BA");
		
		if(m.matches())
			System.out.println("Its valid!");
		else
			System.out.println("It's Invalid!");	

	}

}
