import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Time[] time = new Time[8];
		
		for(int i = 0; i < 8; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String[] str = st.nextToken().split(":");
			int m = Integer.parseInt(str[0]), s = Integer.parseInt(str[1]), ss = Integer.parseInt(str[2]);
			String team = st.nextToken();
			
			time[i] = new Time(team, m, s, ss);
		}
		
		Arrays.sort(time);
		
		int[] score = {10, 8, 6, 5, 4, 3, 2, 1};
		
		int a = 0, b = 0;
		int first = times(time[0]);
		for(int i = 0; i < 8; i++) {
			int t = times(time[i]);
			
			if(t - first > 10000) {
				break;
			}
			
			if(time[i].team.equals("R")) {
				a += score[i];
			}
			else {
				b += score[i];
			}
		}
		
		System.out.print(a > b ? "Red" : "Blue");
	}
	
	public static int times(Time time) {
		return time.ss + time.s * 1000 + time.m * 6000;
	}
}

class Time implements Comparable<Time>{
	String team;
	int m, s, ss;
	
	public Time(String team, int m, int s, int ss) {
		this.team = team;
		this.m = m;
		this.s = s;
		this.ss = ss;
	}

	@Override
	public int compareTo(Time o) {
		if(this.m == o.m) {
			if(this.s == o.s) {
				return this.ss - o.ss;
			}
			return this.s - o.s;
		}
		return this.m - o.m;
	}
}
