import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			String s = br.readLine();
			
			if(s.equals(".")) {
				break;
			}
			
			s = s.replaceAll("[\\.=]", " ");
			
			sb.append(t).append(". ");
			if(s.contains("*")) {
				s = s.replaceAll("\\*", " ");
				int[] num = Cal(s);
				
				sb.append((num[0] * num[1]) % 9 == num[2] % 9 ? "PASS" : "NOT!");
			}
			else {
				s = s.replaceAll("\\+", " ");
				int[] num = Cal(s);
				
				sb.append((num[0] + num[1]) % 9 == num[2] % 9 ? "PASS" : "NOT!");
			}
			sb.append("\n");
			
			t++;
		}
		System.out.print(sb);
	}
	
	public static int[] Cal(String str) {
		String[] s = str.split(" ");
		int[] num = new int[3];
		for(int i = 0; i < s.length; i++) {
			for(char c : s[i].toCharArray()) {
				num[i] += (c - '0');
			}
		}
		return num;
	}
}
