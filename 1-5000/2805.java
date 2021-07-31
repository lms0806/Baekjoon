import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken()), num = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[size];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		long end = arr[0];
		for(int n : arr) {
			end = Math.max(end, n);
		}
		
		long start = 0, answer = -1;
		while(start <= end) {
			long mid = (start + end) / 2, now = 0;
			
			for(int n : arr) {
				now += Math.max(0, n - mid);
				if(now >= num) {
					break;
				}
			}
			
			if(now >= num) {
				answer = mid;
				start = mid + 1;//start 차이 좁혀가기
			}
			else {
				end = mid - 1;//end 차이 좁혀가기
			}
		}
		System.out.print(answer);
	}
}
