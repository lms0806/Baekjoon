import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] nrgs) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] score = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		int answer = 0, max = -1;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			int number = 0;
			for(int nn : score) {
				if(st.nextToken().equals("O")) {
					number += nn;
				}
			}
			
			if(number > max) {
				max = number;
				answer = num;
			}
			else if(number == max && answer > num) {
				answer = num;
			}
		}
		
		System.out.print(answer + " " + max);
	}
}
