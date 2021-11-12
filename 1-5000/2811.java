import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean[] check = new boolean[n];
		int length = 0, count = 0, max = 0;
		for(int i = n - 1; i >= 0; i--) {
			if(arr[i] < 0) {
				length++;
				continue;
			}
			
			for(int j = i + 1 - length * 2; j <= i; j++) {
				if(j >= 0 && !check[j]) {
					check[j] = true;
					count++;
				}
			}
			
			max = Math.max(max, length);
			
			length = 0;
		}
		
		int maxday = 0, result = 0;
		for(int i = n - 1; i >= 0; i--) {
			if(arr[i] < 0) {
				length++;
				continue;
			}
			
			if(length == max) {
				for(int j = i + 1 - length * 3; j <= i; j++) {
					if(j >= 0 && !check[j]) {
						maxday++;
					}
				}
			}
			
			result = Math.max(result, count + maxday);
			
			maxday = length = 0;
		}
		System.out.print(result);
	}
}
