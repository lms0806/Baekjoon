import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int b1= Integer.parseInt(st.nextToken()), a1 = Integer.parseInt(st.nextToken());
		
		int num = (a + a1) - (b + b1);
		
		StringBuilder sb = new StringBuilder();
		if(num > 0) {
			sb.append("Persepolis");
		}
		else if(num < 0) {
			sb.append("Esteghlal");
		}
		else {
			sb.append(b > a1 ? "Esteghlal" : b < a1 ? "Persepolis" : "Penalty");
		}
		System.out.print(sb);
	}
}
