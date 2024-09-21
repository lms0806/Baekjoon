import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String a = br.readLine(), w = br.readLine(), s = br.readLine();
			
			HashMap<Character, Character> map = new HashMap<>();
			for(int i = 0; i < a.length(); i++) {
				map.put(a.charAt(i), a.charAt((i + 1) % a.length()));
			}
			
			ArrayList<Integer> arr = new ArrayList<>();

			char[] ch = w.toCharArray();
			for(int i = 0; i < a.length(); i++) {
				if(i != 0) {
					for(int j = 0; j < w.length(); j++) {
						ch[j] = map.get(ch[j]);
					}
				}
				
				if(kmp(s, new String(ch))) {
					arr.add(i);
				}
			}
			
			if(arr.size() == 0) {
				sb.append("no solution");
			}
			else if(arr.size() == 1) {
				sb.append("unique: ").append(arr.get(0));
			}
			else {
				sb.append("ambiguous: ");
				for(int ar : arr) {
					sb.append(ar).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	public static int[] getpi(String s1) {
		int[] pi = new int[s1.length()];
		int j = 0;
		for(int i = 1; i < s1.length(); i++) {
			while(j > 0 && s1.charAt(i) != s1.charAt(j)) {
				j = pi[j - 1];
			}
			if(s1.charAt(i) == s1.charAt(j)) {
				pi[i] = j += 1;
			}
		}
		return pi;
	}
	
	public static boolean kmp(String s, String s1) {
		int[] pi = getpi(s1);
		int j = 0;
		
		boolean find = false;
		for(int i = 0; i < s.length(); i++) {
			while(j > 0 && s.charAt(i) != s1.charAt(j)) {
				j = pi[j - 1];
			}
			
			if(s.charAt(i) == s1.charAt(j)) {
				if(j == s1.length() - 1) {
					if(!find) {
						find = true;
						j = pi[j];
					}
					else {
						return false;
					}
				}
				else {
					j++;
				}
			}
		}
		return find;
	}
}
