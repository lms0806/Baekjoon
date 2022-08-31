import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		for(int h = 0; h <= n; h++) {
			for(int m = 0; m < 60; m++) {
				for(int s = 0; s < 60; s++) {
					if(h / 10 == k || h % 10 == k || m / 10 == k || m % 10 == k || s / 10 == k || s % 10 == k) {
						answer++;
					}
				}
			}
		}
		System.out.print(answer);
	}
}
