import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num; i++) {
			int sum = Integer.parseInt(br.readLine());
			int number = Integer.parseInt(br.readLine());
			for(int j = 0; j < number; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int q = Integer.parseInt(st.nextToken());
				int p = Integer.parseInt(st.nextToken());
				
				sum += q*p;
			}
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
