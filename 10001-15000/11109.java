import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int d, n, s, p;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			d = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			p = Integer.parseInt(st.nextToken());
			
			int num = n * s;
			int num1 = d + n * p;
			
			if(num > num1) {
				sb.append("parallelize");
			}
			else if(num == num1) {
				sb.append("does not matter");
			}
			else {
				sb.append("do not parallelize");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
