import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = chage(st.nextToken()), y1 = chage(st.nextToken());
			int floor = chage(st.nextToken());
			int x2 = chage(st.nextToken()), y2 = chage(st.nextToken());
			floor += chage(st.nextToken());
			
			sb.append(Math.abs(x1 - x2) + Math.abs(y1 - y2) + floor).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int chage(String s) {
		return Integer.parseInt(s);
	}
}
