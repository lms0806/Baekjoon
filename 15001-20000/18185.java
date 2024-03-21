import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static int answer = 0;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) + 2;
		
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n - 2; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < n - 2; i++) {
			if(arr[i + 1] > arr[i + 2]) {				
				two(i, Math.min(arr[i], arr[i + 1] - arr[i + 2]));
				three(i, Math.min(arr[i], Math.min(arr[i + 1], arr[i + 2])));
				one(i, arr[i]);
			}
			else {
				three(i, Math.min(arr[i], Math.min(arr[i + 1], arr[i + 2])));
				two(i, Math.min(arr[i], arr[i + 1]));
				one(i, arr[i]);
			}
		}
		System.out.print(answer);
	}
	
	public static void one(int idx, int min) {
		arr[idx] -= min;
		answer += min * 3;
	}
	
	public static void two(int idx, int min) {
		arr[idx] -= min;
		arr[idx + 1] -= min;
		answer += min * 5;
	}
	
	public static void three(int idx, int min) {
		arr[idx] -= min;
		arr[idx + 1] -= min;
		arr[idx + 2] -= min;
		answer += min * 7;
	}
}
