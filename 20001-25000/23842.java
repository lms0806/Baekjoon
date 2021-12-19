import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[] num = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(solve(Integer.parseInt(br.readLine()) - 4));
	}
	
	public static String solve(int number) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++){
				for(int k = 0; k < 10; k++) {
					for(int l = 0; l < 10; l++) {
						for(int m = 0; m < 10; m++) {
							for(int n = 0; n < 10; n++) {
								if(num[i] + num[j] + num[k] + num[l] + num[m] + num[n] == number) {
									if(i * 10 + j + k * 10 + l == m * 10 + n) {
										return i + "" + j + "+" + k + "" + l + "=" + m + "" + n;
									}
								}
							}
						}
					}
				}
			}
		}
		return "impossible";
	}
}
