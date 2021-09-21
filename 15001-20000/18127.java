import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()) - 2;
		long b = Long.parseLong(st.nextToken());
		
		long answer = 0, num = 1;
		while(b --> -1) {
			answer += num;
			num += a;
		}
		System.out.print(answer);
	}
}
