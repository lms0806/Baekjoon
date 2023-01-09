import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[100];
		
		int idx = 0;
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int speed = Integer.parseInt(st.nextToken());
			
			int start = idx;
			while(idx < start + num) {
				arr[idx] = speed;
				idx++;
			}
		}
		
		idx = 0;
		int answer = 0;
		while(m --> 0) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			int speed = Integer.parseInt(st.nextToken());
			
			int start = idx;
			while(idx < start + num) {
				if(arr[idx] < speed && answer < speed - arr[idx]) {
					answer =  speed - arr[idx];
				}
				idx++;
			}
		}
		System.out.print(answer);
	}
}
