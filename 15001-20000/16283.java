import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
		
		int s = 0, g = 0;
		int num = 0, answer = 0;
		for(int i = 1; i < n; i++) {
			num = n - i;
			if(a * i + b * num == w) {
				answer++;
				s = i;
				g = num;
			}
		}
		
		System.out.print(answer == 1 ? s + " " + g : -1);
	}
}
