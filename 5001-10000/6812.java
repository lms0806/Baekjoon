import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] s = {"Ottawa", "Victoria", "Edmonton", "Winnipeg", "Toronto", "Halifax", "St. John's"};
		int[] plus = {0, -300, -200, -100, 0, 100, 130};
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length; i++) {
			sb.append(nums(n + plus[i])).append(" in ").append(s[i]).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int nums(int n) {
		int temp = n;
		
		if(n < 0) {
			temp = n + 2400;
		}
		if(n >= 2400) {
			temp = n - 2400;
		}
		
		if(temp % 100 >= 60) {
			temp = 100 * (temp / 100 + 1) + temp % 100 - 60;
		}
		if(temp >= 2400) {
			temp -= 2400;
		}
		
		return temp;
	}
}
