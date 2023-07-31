import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = 1;
		StringBuilder sb = new StringBuilder();
		while(true) {
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0) {
				break;
			}
			
			String[] str = new String[n];
			
			for(int i = 0; i < n; i++) {
				str[i] = br.readLine();
			}
			
			Arrays.sort(str);
			
			sb.append(t++).append("\n");
			for(String s : str) {
				sb.append(s).append("\n");
			}
		}
		System.out.print(sb);
	}
}
