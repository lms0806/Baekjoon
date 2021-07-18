import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), size = Integer.parseInt(st.nextToken());
		
		int num = 0;
		st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			int number = Integer.parseInt(st.nextToken());
			num += number % 2 == 0 ? number / 2 : number / 2 + 1;
		}
		
		System.out.print(num < n ? "NO" : "YES");
	}
}
