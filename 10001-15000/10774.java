import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()), m = Integer.parseInt(br.readLine());
		
		char[] c = new char[n];
		
		for(int i = 0; i < n; i++) {
			c[i] = br.readLine().charAt(0);
		}
		
		int answer = 0;
		while(m --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char size = st.nextToken().charAt(0);
			int num = Integer.parseInt(st.nextToken());
			
			if(c[num - 1] == '\u0000') {
				continue;
			}
			
			if(check(c[num - 1], size)) {
				answer++;
				c[num - 1] = '\u0000';
			}
		}
		System.out.print(answer);
	}
	
	public static boolean check(char a , char b) {
		return a == b || b == 'S' || (b == 'M' && a == 'L');
	}
}
