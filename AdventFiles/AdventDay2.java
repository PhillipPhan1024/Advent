import java.util.*;
import java.io.*;

public class AdventDay2 {

    public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(new File("AdventData.dat"));

    	int horiz = 0;
    	int depth = 0;

    	while(scan.hasNext()) {
    		String s = scan.next();
			if(s.equals("forward")) {
				horiz += scan.nextInt();
			}
			else if(s.equals("up")) {
				depth -= scan.nextInt();
			}
			else if(s.equals("down")) {
				depth += scan.nextInt();
			}
    	}

    	System.out.println(horiz * depth);
    }
}