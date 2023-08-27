import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
				
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int day = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			if(day == 0) {
				break;
			}
			
			int month = 0;
			for(int i = 1; i < months.length; i++) {
				if(s.equals(months[i])) {
					month = i + 1;
					break;
				}
			}
			
			sb.append(solve(month, day)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(int month, int day) {
		if(month == 2 && day > 28) {
			return "Unlucky";
		}
		if(month == 8 && day == 4) {
			return "Happy birthday";
		}
		
		if(month > 8 || (month == 8 && day > 4)) {
			return "No";
		}
		return "Yes";
	}
}
