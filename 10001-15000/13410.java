import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int max = 0;
		for(int i = 2; i <= k; i++) {
			int a = n * i;
			
			int num = 0;
			while(a != 0) {
				num += a % 10;
				num *= 10;
				a /= 10;
			}
			
			if(max < num/10) {
				max = num/10;
			}
		}
		System.out.print(max);
	}
}
