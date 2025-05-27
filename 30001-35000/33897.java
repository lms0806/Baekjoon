import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int now = 0, answer = 1, count = 0, max = 0; 
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num < now) {
				answer++;
				count = 0;
			}
			count++;
			max = Math.max(max, count);
			now = num;
		}
		System.out.print(answer + " " + max);
	}
}
