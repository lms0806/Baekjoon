import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		while(n != 0) {
			int num = n % b;
			sb.append(num < 10 ? (char)(num + '0') : (char)(num - 10 + 'A'));
			n /= b;
		}
		System.out.print(sb.reverse());
	}
}
