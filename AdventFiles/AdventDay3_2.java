import java.util.*;
import java.io.*;

public class AdventDay3_2 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(new File("AdventData.dat"));

		ArrayList<String> s = new ArrayList<String>();
		ArrayList<String> s2 = new ArrayList<String>();

		int oxy = 0;
		int co2 = 0;

		while(scan.hasNext()) {
			String str = scan.nextLine();
			if(str.substring(0, 1).equals("1")) {
				s.add(str);
			}
			else {
				s2.add(str);
			}
		}

		//solve for Oxy
		for(int i = 1; s.size() > 1; i++) {
			s = checkCriteria(s, i, true);
		}
		oxy = Integer.parseInt(s.get(0), 2);
	

		//solve for co2
		for(int i = 1; s2.size() > 1; i++) {
			s2 = checkCriteria(s2, i, false);
		}
		co2 = Integer.parseInt(s2.get(0), 2);


		//print life support rating
		System.out.println(oxy * co2);
	}

	public static ArrayList<String> checkCriteria(ArrayList<String> s, int i, boolean oxy) {

		int stop = s.size();

		//s holds 0
		//s2 holds 1
		
		ArrayList<String> s2 = new ArrayList<>();

		for (int j = 0; j < stop; j++) {
			if(s.get(j).substring(i, i+1).equals("1")) {
				s2.add(s.remove(j));
				j--;
				stop--;
			}
		}

		if(oxy) {
			if(s.size() > s2.size()) {
				return s;
			}
			else if(s.size() == s2.size()) {
				return s2;
			}
			else {
				return s2;
			}
		}
		else {
			if(s.size() < s2.size()) {
				return s;
			}
			else if(s.size() == s2.size()) {
				return s;
			}
			else {
				return s2;
			}
		}	
	}
}