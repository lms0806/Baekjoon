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
		
		System.out.print(solve(num, sum));
	}
	
	public static String solve(int[] num, int sum) {
		for(int i = 0; i < 8; i++) {
			for(int j = i + 1; j < 9; j++) {
				if(sum - num[i] - num[j] == 100) {
					String s = "";
					for(int k = 0; k < 9; k++) {
						if(k != i && k != j) {
							s += num[k] + "\n";
						}
					}
					return s;
				}
			}
		}
		return "";
	}
}
