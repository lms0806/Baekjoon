import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static ArrayList<String> arr = new ArrayList<>();
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		while(n --> 0) {
			String s = br.readLine();
			if(!check(s.split(" ")) && !check2(s)) {
				sb.append(s).append("\n");
			}
		}
		System.out.print(sb);
	}
	
	public static boolean check(String[] str) {
		for(int i = 0; i < str.length; i++) {
			String strs = (str[i].charAt(0) + "").toUpperCase();
			
			if(!arr.contains(strs)) {
				arr.add(strs);
				for(int j = 0; j < str.length; j++) {
					if(i == j) {
						sb.append("[" + str[i].substring(0,1) + "]" + str[i].substring(1));
					}
					else {
						sb.append(str[j]);
					}
					sb.append(" ");
				}
				sb.append("\n");
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean check2(String s) {
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == ' ') {
				continue;
			}
			
			String strs = (c + "").toUpperCase();
			
			if(!arr.contains(strs)) {
				arr.add(strs);
				sb.append(s.substring(0, i) + "[" + c + "]" + s.substring(i + 1)).append("\n");
				return true;
			}
		}
		return false;
	}
}
