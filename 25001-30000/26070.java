import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] a = new int[3], x = new int[3];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 3; i++) {
			x[i] = Integer.parseInt(st.nextToken());
		}
		
		long answer = 0;
		while(true) {
			boolean flag = true;
			
			for(int i = 0; i < 3; i++) {
				int eat = Math.min(a[i], x[i]);
				
				answer += eat;
				a[i] -= eat;
				x[i] -= eat;
			}
			
			if(a[0] == 0 && a[1] == 0 && a[2] == 0) {
				break;
			}
			
			for(int i = 0; i < 3; i++) {
				if(a[i] == 0 && x[i] >= 3) {
					flag = false;
					x[(i + 1) % 3] += x[i] / 3;
					x[i] %= 3;
				}
			}
			
			if(flag) {
				break;
			}
		}
		System.out.print(answer);
	}
}
