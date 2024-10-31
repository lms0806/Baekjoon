import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int ba = 0, bb = 0;
		boolean flag = true;
		while(n --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

			if(ba > a || bb > b) {
				flag = false;
				break;
			}
			
			ba = a;
			bb = b;
		}
		System.out.print(flag ? "yes" : "no");
	}
}
