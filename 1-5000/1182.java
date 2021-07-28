import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n, s;
	static int[] arr = new int[22];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(solve(false, 0, 0));
	}
	
	public static int solve(boolean flag, int idx, int num) {
		if(idx == n) {	//끝부분까지 갔을 때
			if(num == s && flag) { // flag가 true면 다 확인했고, 값이 같으므로 1
				return 1;
			}
			return 0; // 끝까지 갔으나 다르므로 0
		}
		
		return solve(true, idx + 1, num + arr[idx]) + solve(flag, idx + 1, num);
	}
}
