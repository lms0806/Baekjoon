import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken()), count = Integer.parseInt(st.nextToken());
		
		while(t --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			while(num % 2 == 0) {
				count--;
				num >>= 1;
			}
		}
		System.out.print(count > 0 ? 0 : 1);
	}
}
