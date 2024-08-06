import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine())));
	}
	
	public static String solve(int n) {
		int[] num = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
		
		for(int i = 1; i < 13; i++) {
			int count = num[i / 10] + num[i % 10];
			
			if(count >= n) {
				continue;
			}
			
			for(int j = 0; j < 59; j++) {
				if(count + num[j % 10] + num[j / 10] == n) {
					return String.format("%02d:%02d", i, j);
				}
			}
		}
		return "Impossible";
	}
}
