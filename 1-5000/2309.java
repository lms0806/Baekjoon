import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int sum = 0;
		int[] num = new int[9];
		for(int i = 0; i < 9; i++) {
			num[i] = Integer.parseInt(br.readLine());
			sum += num[i];
		}
		
		Arrays.sort(num);
		
		solve(num, sum);
	}
	
	public static void solve(int[] num, int sum) {
		
		StringBuilder sb  = new StringBuilder();
		for(int i = 0; i < 8; i++) {
			for(int j = i + 1; j < 9; j++) {
				if(sum - num[i] - num[j] == 100) {
					for(int k = 0; k < 9; k++) {
						if(k != i && k != j) {
							sb.append(num[k]).append("\n");
						}
					}
					break;
				}
			}
			if(!sb.toString().equals("")) {
				break;
			}
		}
		System.out.print(sb);
	}
}
