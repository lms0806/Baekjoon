import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 200;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			answer = Math.min(answer, Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		}
		System.out.print(answer);
	}
}
