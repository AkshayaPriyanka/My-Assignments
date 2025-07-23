package week3.day3;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String browser="Google";
         char[] charArray = browser.toCharArray();
        System.out.println("The String is : "+browser);
        Set <Character> set1=new LinkedHashSet <Character>();
        for(char letters:charArray)
        {
        	set1.add(letters);
        	//System.out.println(set1);
        }
        System.out.println(set1);
	}

}
