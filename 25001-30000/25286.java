import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int y = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int d = 0;
			
			if(m == 3) {
				m--;
				d = (y % 100 != 0 && y % 4 == 0) || y % 400 == 0 ? 29 : days[m - 1];
			}
			else if(m == 1){
				y--;
				m = 12;
				d = days[m - 1];
			}
			else {
				m--;
				d = days[m - 1];
			}
			
			sb.append(y).append(" ").append(m).append(" ").append(d).append("\n");
		}
		System.out.print(sb);
	}
}
