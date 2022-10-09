import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = stoi(st.nextToken()) + stoi(st.nextToken()) * 30 + stoi(st.nextToken()) * 12 * 30;
		int days = stoi(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int b = stoi(st.nextToken()) + stoi(st.nextToken()) * 30 + stoi(st.nextToken()) * 12 * 30;
		
		System.out.print((b - a + days - 1) % 7 + 1);
	}
	
	public static int stoi(String s) {
		return Integer.parseInt(s);
	}
}
