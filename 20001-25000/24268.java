import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int d;
	static int[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		arr = new int[d];
		
		for(int i = 0; i < d; i++) {
			arr[i] = i;
		}

		int answer = -1;
		while(nextPermutation()) {	
			if(arr[0] == 0) {
				continue;
			}
			
			int num = 0;
			for(int i = 0; i < d; i++) {
				num += arr[d - i - 1] * Math.pow(d, i);
			}
			
			if(num > n) {
				answer = num;
				break;
			}
		}
		System.out.print(answer);
	}
	
	public static boolean nextPermutation() {
		int idx = 0;
		for (int i = d - 1; i > 0; i--) {
			if (arr[i - 1] < arr[i]) {
				idx = i;
				break;
			}
		}

		if (idx <= 0) {
			return false;
		}

		for (int i = d - 1; i >= idx; i--) {
			if (arr[idx - 1] < arr[i]) {
				int temp = arr[idx - 1];
				arr[idx - 1] = arr[i];
				arr[i] = temp;
				break;
			}
		}
		
		Arrays.sort(arr, idx, d);
		
		return true;
	}
}
