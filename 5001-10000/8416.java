import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()) % 10, b = Integer.parseInt(st.nextToken()) % 4;
		
		if(b == 0) {
			b = 4;
		}
		
		int answer = 1;
		while(b --> 0) {
			answer *= a;
		}
		System.out.print(answer % 10);
	}
}
