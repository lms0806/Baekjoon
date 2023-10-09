import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int n, k, answer = 0;
	static boolean[] use;
	static ArrayList<Integer>[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()) - 2;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken());
		while(n --> 0) {
			if(num > 0) {
				num -= Integer.parseInt(st.nextToken());
			}
			else {
				num += Integer.parseInt(st.nextToken());
			}
		}
		
		num = Math.abs(num);
		
		int answer = 0;
		int[] arr = {100, 50, 20, 10, 5, 2, 1};
		for(int i = 0; i < 7; i++) {
			if(num >= arr[i]) {
				answer += num / arr[i];
				num %= arr[i];
			}
		}
		System.out.print(answer);
	}
}
