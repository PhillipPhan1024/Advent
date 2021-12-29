import java.util.*;
import java.io.*;

public class AdventDay3 {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(new File("AdventData.dat"));

		ArrayList<String> s = new ArrayList<String>();
		Map<Integer, Integer> map = new HashMap<>();

		String binary = "";
		String epsilon = "";

		while(scan.hasNext()) {
			s.add(scan.next());
		}

		for(int i = 0; i < s.size(); i++) {
			 String curr = s.get(i);

			 for(int j = 0; j < s.get(i).length(); j++) {
				if(!map.containsKey(j)) {
					map.put(j, Integer.parseInt(curr.substring(j, j+1)));
				}
				else {
					map.put(j,map.get(j) + Integer.parseInt(curr.substring(j, j+1)));
				}
			 }
		}

		for(int x = 0; x < map.size(); x++) {
			if(map.get(x) < s.size() / 2) {
				binary += "0";
				epsilon += "1";
			}
			else {
				binary += "1";
				epsilon += "0";
			}
		}
		System.out.println(binary);
		System.out.println(epsilon);

		int one = Integer.parseInt(binary, 2);
		int two = Integer.parseInt(epsilon, 2);
		System.out.print(one * two);

	}

}