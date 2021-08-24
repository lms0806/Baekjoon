import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] num = new int[n];
		
		for(int i = 0; i < n; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		for(int i = 0; i < n - k; i++) {
			int number = 0;
			for(int j = i; j < i + k; j++) {
				number += num[j];
			}
			max = Math.max(max, number);
		}
		System.out.print(max);
	}
}
