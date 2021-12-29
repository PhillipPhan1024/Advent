import java.util.*;
import java.io.*;

public class AdventDay2_2 {

    public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(new File("AdventData.dat"));

    	int horiz = 0;
    	int depth = 0;
    	int aim = 0;

    	while(scan.hasNext()) {
    		String s = scan.next();
			if(s.equals("forward")) {
				int n = scan.nextInt();
				horiz += n;
				depth += n*aim;
			}
			else if(s.equals("up")) {
				aim -= scan.nextInt();
			}
			else if(s.equals("down")) {
				aim += scan.nextInt();
			}
    	}

    	System.out.println(horiz * depth);
    }
}