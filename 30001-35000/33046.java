import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		num += Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) - 1;
		
		num %= 4;
		
		System.out.print(num == 0 ? 4 : num);
	}
}
