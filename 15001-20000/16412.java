import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		for(int i = a; i <= b; i++) {
			int[] arr = new int[10];
			
			String s = String.valueOf(i);
			for(char c : s.toCharArray()) {
				arr[c - '0']++;
			}
			
			boolean flag = true;;
			for(int j = 1; j <= 9; j++) {
				if((arr[j] == 1 && i % j != 0) || (arr[j] >= 2) || (arr[0] != 0)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
