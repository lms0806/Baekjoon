import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		
		int answer = 0, min = Integer.MAX_VALUE;
		for(int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine());
			
			int num = Math.abs(1 - Integer.parseInt(st.nextToken())) + Math.abs(m + 1 - Integer.parseInt(st.nextToken()));
			
			if(num < min) {
				min = num;
				answer = i;
			}
		}
		System.out.print(answer);
	}
}
