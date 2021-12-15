import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = {0, -300, -200, -100, 0, 100, 130};
		String[] str = {"Ottawa", "Victoria", "Edmonton", "Winnipeg", "Toronto", "Halifax", "St. John's"};
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			int num = n + arr[i];
			if(num < 0) {
				num += 2400;
			}
			if(num >= 2400) {
				num -= 2400;
			}
			if(num % 100 >= 60) {
				num = 100 * (num / 100 + 1) + num % 100 - 60;
			}
			sb.append(num).append(" in ").append(str[i]).append("\n");
		}
		System.out.print(sb);
	}
}
