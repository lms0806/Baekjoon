import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		StringBuilder sb = new StringBuilder();
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			long n = Long.parseLong(st.nextToken());
			long w = Long.parseLong(st.nextToken()), d = Long.parseLong(st.nextToken());
			long sum = Long.parseLong(st.nextToken());
			
			long answer = (w * (n - 1) * n / 2 - sum) / d;
			
			sb.append(answer == 0 ? n : answer).append("\n");
		}
		System.out.print(sb);
	}
}
