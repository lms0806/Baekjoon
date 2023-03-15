import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int s = 0, e = 0;
		int[] number = new int[100001];
		int answer = 0;
		while(e < n) {
			if(number[arr[e]] == k) {
				number[arr[s]]--;
				s++;
			}
			else {
				number[arr[e]]++;
				e++;
			}
			answer = Math.max(answer, e - s);
		}
		System.out.print(answer);
	}
}
