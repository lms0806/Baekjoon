import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size-->0) {
			int num = Integer.parseInt(br.readLine());
			
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			while(num-->0) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
