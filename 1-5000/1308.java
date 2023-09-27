import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int sy = Integer.parseInt(st.nextToken()), sm = Integer.parseInt(st.nextToken()), sd = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int ey = Integer.parseInt(st.nextToken()), em = Integer.parseInt(st.nextToken()), ed = Integer.parseInt(st.nextToken());
		
		System.out.print(solve(sy, sm, sd, ey, em, ed));
	}
	
	public static String solve(int sy, int sm, int sd, int ey, int em, int ed) {
		if(ey - sy > 1000 || (ey - sy == 1000 && em > sm) || (ey - sy == 1000 && em == sm && ed >= sd)) {
			return "gg";
		}
		
		return "D-" + (count_day(ey, em, ed) - count_day(sy, sm, sd));
	}
	
	public static long count_day(int y, int m, int d) {
		long days = 0;
		
		int[] day;
		for(int i = 1; i < y; i++) {
			day = check_yun(i);
			
			for(int da : day) {
				days += da;
			}
		}
		
		day = check_yun(y);
		
		for(int i = 0; i < m - 1; i++) {
			days += day[i];
		}
		
		return days + d;
	}
	
	public static int[] check_yun(int y) {
		int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if((y % 4 == 0 && y % 100 != 0 ) || y % 400 == 0) {
			day[1] = 29;
		}
		
		return day;
	}
}
