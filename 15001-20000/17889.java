import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(br.readLine());
		
		int startyear = 2018, startmonth = 3;
		
		while(startyear < year) {
			startmonth += 26;
			
			startyear += startmonth / 12;
			startmonth %= 12;
		}
		
		System.out.print(year == startyear ? "yes" : "no");
	}
}
