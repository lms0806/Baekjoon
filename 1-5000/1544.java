import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		
		set.add(br.readLine());
		while(size --> 1) {
			check(set, br.readLine());
		}
		
		System.out.print(set.size());
	}
	
	public static void check(HashSet<String> set, String s) {
		for(String str : set) {
			StringBuilder sb = new StringBuilder(str);
			for(int i = 0; i < s.length(); i++) {
				if(s.equals(sb.toString())) {
					return;
				}
				else {
					sb = sb.append(sb.charAt(0)).deleteCharAt(0);
				}
			}
		}
		set.add(s);
	}
}
