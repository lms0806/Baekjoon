import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int num = size;
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			String[] str = new String[n];
			for(int i = 0; i < n; i++) {
				str[i] = br.readLine();
			}
			
			sb.append("Scenario #").append(num - size).append(":").append("\n");
			n = Integer.parseInt(br.readLine());
			while(n --> 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken());
				while(s --> 0) {
					sb.append(str[Integer.parseInt(st.nextToken())]);
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
