import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(n --> 0) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			sb.append(sum == 0 ? "Equilibrium" : sum > 0 ? "Right" : "Left").append("\n");
		}
		System.out.print(sb);
	}
}
