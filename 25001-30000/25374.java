import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[101];
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		
		int sum = 0, idx = 0, count = 0;
		int[] standard = {0, 4, 11, 23, 40, 60, 77, 89, 96, 100, 111};
		StringBuilder sb = new StringBuilder();
		for(int i = arr.length - 1; i >= 0; i--) {
			count += arr[i];
			sum += arr[i];
			
			if(standard[idx + 1] <= sum) {
				sb.append(count).append("\n");
				count = 0;
				idx++;
			}
			
			while(standard[idx + 1] <= sum) {
				idx++;
				sb.append("0\n");
			}
		}
		for(; idx <= 8; idx++) {
			sb.append("0\n");
		}
		System.out.print(sb);
	}
}
