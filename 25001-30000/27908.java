import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
		
		int totalweek = 1 + (n - 8 + d + 6) / 7;
		
		print();
		
		int day = 1;
		for(int week = 1; week <= totalweek; week++) {
			sb.append("|");
			for(int weekday = 1; weekday <= 7; weekday++) {
				if((week == 1 && weekday < d) || day > n) {
					sb.append("...");
				}
				else {
					sb.append(day > 9 ? "." : "..").append(day++);
				}
			}
			sb.append("|").append("\n");
		}
		
		print();
		
		System.out.print(sb);
	}
	
	public static void print() {
		sb.append("+").append("-".repeat(21)).append("+").append("\n");
	}
}
