import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int w = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		st = new StringTokenizer(br.readLine());
		while(p --> 0) {
			int h = Integer.parseInt(st.nextToken());
			
			if(w <= h && h <= n) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
