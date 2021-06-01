import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		
		long answer = 0;
		long num = 1;
		while(b --> -1) {
			answer += num;
			num+=(a-2);
		}
		System.out.print(answer);
	}
}
