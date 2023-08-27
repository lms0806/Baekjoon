import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int l1 = Integer.parseInt(st.nextToken()), r1 = Integer.parseInt(st.nextToken());
		int l2 = Integer.parseInt(st.nextToken()), r2 = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] num = new int[50001];
		
		for(int i = l1; i <= r1; i++) {
			num[i]++;
		}
		for(int i = l2; i <= r2; i++) {
			num[i]++;
		}
		
		int answer = 0;
		for(int i = 0; i < num.length; i++) {
			if(i != k && num[i] == 2) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
