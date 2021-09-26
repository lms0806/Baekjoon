import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int[] alpha = new int[26];
			
			for(char ch : st.nextToken().toCharArray()) {
				alpha[ch - 97]++;
			}
			for(char ch : st.nextToken().toCharArray()) {
				alpha[ch - 97]--;
			}
			
			sb.append(check(alpha) ? "Possible" : "Impossible").append("\n");
		}
		System.out.print(sb);
	}
	
	public static boolean check(int[] alpha) {
		for(int a : alpha) {
			if(a != 0) {
				return false;
			}
		}
		return true;
	}
}
