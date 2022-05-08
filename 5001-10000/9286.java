import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= t; i++) {
			sb.append("Case ").append(i).append(":").append("\n");
			int size = Integer.parseInt(br.readLine());
			
			while(size --> 0) {
				int n = Integer.parseInt(br.readLine());
				
				if(n < 6) {
					sb.append(n + 1).append("\n");
				}
			}
		}
		System.out.print(sb);
	}
}
