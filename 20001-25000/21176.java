import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int k = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
		
		int[] num = new int[k];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < k; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		while(r --> 0) {
			st = new StringTokenizer(br.readLine());
			
			int min = 100000;
			for(int i = 0; i < k; i++) {
				int n = Integer.parseInt(st.nextToken());
				if(n != 0) {
					min = Math.min(min, num[i] / n);
				}
			}
			
			max = Math.max(max, min * Integer.parseInt(st.nextToken()));
		}
		System.out.print(max);
	}
}
