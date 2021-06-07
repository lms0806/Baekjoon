import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		boolean[] b = new boolean[n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			int number = num;
			while(number <= n) {
				if(!b[number]) {
					b[number] = true;
				}
				number += num;
			}
		}
		
		int answer = 0;
		for(int i = 0; i < b.length; i++) {
			if(b[i]) {
				answer += i;
			}
		}
		
		System.out.print(answer);
	}
}
