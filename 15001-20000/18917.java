import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 		
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		long num = 0, sum = 0;
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			if(a == 1) {
				int b = Integer.parseInt(st.nextToken());
				sum += b;
				num ^= b;
			}
			else if(a == 2) {
				int b = Integer.parseInt(st.nextToken());
				sum -= b;
				num ^= b;
			}
			else {
				sb.append(a == 3 ? sum : num).append("\n");
			}
		}
		System.out.print(sb);
	}
}
