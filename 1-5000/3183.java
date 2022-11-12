import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int day = Integer.parseInt(st.nextToken()), month = Integer.parseInt(st.nextToken()), year = Integer.parseInt(st.nextToken());
			
			if(day == 0 && month == 0 && year == 0) {
				break;
			}
			
			sb.append(solve(year, month, day)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int year, int month, int day) {
		if(day == 0 || month == 0 || day == 0 || month > 12) {
			return "Invalid";
		}
		
		if(month == 2) {
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				if(day > 29) {
					return "Invalid";
				}
			}
			else {
				if(day > 28) {
					return "Invalid";
				}
			}
		}
		
		if(month != 2 && days[month - 1] < day) {
			return "Invalid";
		}
		
		return "Valid";
		
	}
}
