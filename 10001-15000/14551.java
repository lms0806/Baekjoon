import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int answer = 1;
		while(n --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			if(num != 0) {
				answer *= num;
				answer %= m;
			}
		}
		System.out.print(answer % m);
	}
}
