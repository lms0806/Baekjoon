import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), key = Integer.parseInt(st.nextToken());
		
		int sum = 0, answer = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num < key) {
				sum += num;
				if(sum >= key) {
					sum = 0;
					answer++;
				}
			}
			else {
				sum = 0;
				answer++;
			}
		}
		System.out.print(answer);
	}
}
