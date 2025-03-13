import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		int h = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int answer = h / 10 + h % 10;
		
		boolean start = false;
		if(m >= 30) {
			m -= 30;
			answer++;
			start = true;
		}
		
		System.out.print(answer + (m / 10) + (start ? 0 : 1));
	}
}
