import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = Integer.parseInt(st.nextToken());
			sum += Integer.parseInt(st.nextToken());
			
			if(sum == 0) {
				break;
			}
			
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}
