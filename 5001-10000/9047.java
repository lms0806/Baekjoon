import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			String s = br.readLine();
			
			int answer = 0;
			while(!s.equals("6174")) {
				char[] ch = s.toCharArray();
				
				Arrays.sort(ch);
				
				String a = "", b = "";
				for(char c : ch) {
					b += c;
				}
				for(int i = ch.length - 1; i >= 0; i--) {
					a += ch[i];
				}
				
				s = Integer.toString((Integer.parseInt(a)) - Integer.parseInt(b));
				
				while(s.length() != 4) {
					s += "0";
				}
				
				answer++;
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
