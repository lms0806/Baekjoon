import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int answer = 0, sum = 0;
		while(true) {
			if(sum + a > b) {
				break;
			}
			sum += a;
			answer++;
			
			a *= 2;
		}
		System.out.print(answer);
	}
}
