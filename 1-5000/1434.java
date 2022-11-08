import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int num = 0;
		
		st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			num += Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		while(m --> 0) {
			num -= Integer.parseInt(st.nextToken());
		}
		
		System.out.print(num);
	}
}
