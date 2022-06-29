import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), p = Integer.parseInt(st.nextToken());
		
		int num = n, answer = 1;
		int[] nums = new int[1001];
		while(nums[num] == 0) {
			nums[num] = answer++;
			num = num * n % p;
		}
		
		System.out.print(answer - nums[num]);
	}
}
