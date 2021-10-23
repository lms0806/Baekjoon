import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String check = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.";
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 0) {
				break;
			}
			
			StringBuilder ss = new StringBuilder();
			for(char c : st.nextToken().toCharArray()) {
				ss.append(check.charAt((check.indexOf(c) + n) % 28));
			}
			sb.append(ss.reverse()).append("\n");
		}
		System.out.print(sb);
	}
}
