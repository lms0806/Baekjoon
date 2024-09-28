import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num = (int) (Math.pow(Integer.parseInt(st.nextToken()), 2) + Math.pow(Integer.parseInt(st.nextToken()), 2));
			
			answer += num <= 100 ? 10 : num <= 900 ? 9 : num <= 2500 ? 8 : num <= 4900 ? 7 : num <= 8100 ? 6 : num <= 12100 ? 5 : num <= 16900 ? 4 : num <= 22500 ? 3 : num <= 28900 ? 2 : num <= 36100 ? 1 : 0; 
		}
		System.out.print(answer);
	}
}
