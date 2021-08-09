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
			int[] alpha = new int[26];
			
			for(char ch : br.readLine().toCharArray()) {
				if(ch != ' ') {
					alpha[ch - 'a']++;
				}
			}
			
			int max = 0, count = 0, n = 0;
			for(int i = 0; i < alpha.length; i++) {
				if(max < alpha[i]) {
					max = alpha[i];
					n = i;
					count = 0;
				}
				else if(max == alpha[i]) {
					count++;
				}
			}
			
			sb.append(count != 0 ? "?" : (char)(n + 'a')).append("\n");
 		}
		System.out.print(sb);
	}
}
