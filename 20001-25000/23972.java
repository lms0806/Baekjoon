import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long k = Long.parseLong(st.nextToken()), n = Long.parseLong(st.nextToken());
		
		long answer = -1;
		if(n != 1) {
			answer = (k * n) / (n - 1);
			
			if((k * n) % (n - 1) != 0){
				answer++;
			}
		}
		System.out.print(answer);
	}
}
