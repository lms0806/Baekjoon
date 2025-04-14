import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int answer = 0, date = 13;
		for(int year = 2019; year <= n; year++) {
			for(int mon = 1; mon <= 12; mon++) {
				if(date % 7 == 4) {
					answer++;
				}
				
				date += day[mon];
				
				if(mon == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
					date++;
				}
			}
		}
		System.out.print(answer);
	}
}
