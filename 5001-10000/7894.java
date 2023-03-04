import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			double answer = 0;
			for(int i = 1; i <= n; i++) {
				answer += Math.log10(i);
			}
			
			sb.append((int)answer + 1).append("\n");
		}
		System.out.print(sb);
	}
}
