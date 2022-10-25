import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		ArrayList<String> arr = new ArrayList<>();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("XXXXXX")) {
				break;
			}
			
			arr.add(s);
		}
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals("XXXXXX")) {
				break;
			}
			
			char[] c = s.toCharArray();
			
			Arrays.sort(c);
			
			TreeSet<String> set = new TreeSet<>();
			for(String a : arr) {
				if(check(a, new String(c))) {
					set.add(a);
				}
			}
			
			if(set.size() == 0) {
				sb.append("NOT A VALID WORD").append("\n");
			}
			else {
				Iterator<String> iter = set.iterator();
				while(iter.hasNext()) {
					sb.append(iter.next()).append("\n");
				}
			}
			
			sb.append("******").append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(String s, String s1) {
		char[] c = s.toCharArray();
		
		Arrays.sort(c);
		
		return new String(c).equals(s1) ? true : false;
	}
}
