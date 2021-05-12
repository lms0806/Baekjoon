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
			String a = st.nextToken();
			String b = st.nextToken();
			
			int[] alpha = new int[26];
			boolean istrue = true;
			
			for(int i = 0; i < a.length(); i++) {
				alpha[a.charAt(i)-97]++;
			}
			
			for(int i = 0; i < b.length(); i++) {
				alpha[b.charAt(i)-97]--;
			}
			
			for(int i = 0; i < alpha.length; i++) {
				if(alpha[i] != 0) {
					istrue = false;
					break;
				}
			}
			
			sb.append(istrue ? "Possible" : "Impossible").append("\n");
		}
		System.out.print(sb);
	}
}
