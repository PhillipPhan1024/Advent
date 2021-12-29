import java.util.*;
import java.io.*;

public class AdventDay1_2 {

    public static void main(String[] args) throws Exception{
    	Scanner scan = new Scanner(new File("AdventData.dat"));

    	int count = 0;
		int val1 = scan.nextInt();
		int val2 = scan.nextInt();
		int val3 = scan.nextInt();
		int total = val1 + val2 + val3;

    	while(scan.hasNextInt()) {
    		val1 = val2;
			val2 = val3;
			val3 = scan.nextInt();
			int totalTemp = val1 + val2 + val3;
			if(totalTemp > total) {
				count++;
			}
    		total = totalTemp;
    	}

    	System.out.println(count);
    }

}