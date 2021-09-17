import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] num = new int[1000001];
		
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
			
			num[x] = g;
		}
		
		int d = k * 2 + 1;
		
		int sum = 0, answer = 0;
		for(int i = 0; i < num.length; i++) {
			sum += i >= d ? num[i] - num[i - d] : num[i];
			if(answer < sum) {
				answer = sum;
			}
		}
		System.out.print(answer);
	}
}
