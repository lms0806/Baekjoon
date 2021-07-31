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
		
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int start = 1, end = arr[size - 1], answer = -1;
		while(start <= end) {
			int mid = (start + end) / 2;
			int count = 1, last = arr[0];
			
			for(int i = 1; i < size; i++) {
				if(arr[i] - last >= mid) {
					count++;
					last = arr[i];//차이 좁혀가기
				}
			}
			
			if(count >= num) {
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
