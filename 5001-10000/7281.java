import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int idx = 0;
		int answer = 0;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(b == 1) {
				if(idx == 0) {
					idx = a;
				}
				else {
					answer = Math.max(answer, a - idx);
					
					idx = a;
				}
			}
		}
		System.out.print(answer);
	}
}
