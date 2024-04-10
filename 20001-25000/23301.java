import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[1001];
		
		while(n --> 0) {
			int k = Integer.parseInt(br.readLine());
			
			while(k --> 0) {
				st = new StringTokenizer(br.readLine());
				int s = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken());
				
				for(int i = s; i < e; i++) {
					arr[i]++;
				}
			}
		}
		
		int answer = 0, as = 0, ae = 0;
		for(int i = 0; i < arr.length - t; i++) {
			int sum = 0;
			for(int j = i; j < i + t; j++) {
				sum += arr[j];
			}
			
			if(answer < sum) {
				answer = sum;
				as = i;
				ae = i + t;
			}
		}
		System.out.print(as + " " + ae);
		
	}
}
