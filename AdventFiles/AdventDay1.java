import java.util.*;
import java.io.*;

public class AdventDay1 {

    public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(new File("AdventData.dat"));
    	int count = 0;
		int val1 = scan.nextInt();

    	while(scan.hasNextInt()) {
			int val2 = scan.nextInt();
			if(val2 > val1) {
				count++;
			}
    		val1 = val2;
    	}

    	System.out.println(count);
    }

}