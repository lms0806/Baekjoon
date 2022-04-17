import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			int max = -1000000;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				max = Math.max(max, Integer.parseInt(st.nextToken()));
			}
			
			answer += Math.max(0, max);
		}
		System.out.print(answer);
	}
}
