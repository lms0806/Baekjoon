import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());

		arr = new int[n][2];
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			st.nextToken();
		}
		
		int a = 0, b = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i][1] < 5) {
				a += sum(i);
			}
			else {
				b += sum(i);
			}
		}
		System.out.print(a + " " + b);
	}
	
	public static int sum(int i) {
		for(int j = i - 1; j >= 0; j--) {
			if(arr[i][0] <= arr[j][0] + 10 && arr[i][1] == arr[j][1]) {
				return 150;
			}
		}
		return 100;
	}
}
