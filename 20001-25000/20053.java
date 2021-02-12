import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int num, number;
		
		StringBuilder sb = new StringBuilder();
		while(size-->0) {
			num = Integer.parseInt(br.readLine());
			
			int min = 1000000, max = -1000000;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(num-->0) {
				number = Integer.parseInt(st.nextToken());
				min = Math.min(min, number);
				max = Math.max(max, number);
			}
			sb.append(min).append(" ").append(max).append("\n");
		}
		System.out.print(sb);
	}
}
