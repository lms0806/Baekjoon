import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		long x1 = Long.parseLong(st.nextToken()), y1 = Long.parseLong(st.nextToken());
		long r1 = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		long x2 = Long.parseLong(st.nextToken()), y2 = Long.parseLong(st.nextToken());
		long r2 = Long.parseLong(st.nextToken());
		
		long dist = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
		
		String answer = "NO";
		if(x1 == x2 && y1 == y2) {
			answer = "YES";
		}
		else {
			if(dist <= (r1 - r2) * (r1 - r2) || (dist < (r1 + r2) * (r1 + r2) && dist > (r1 - r2) * (r1 - r2))) {
				answer = "YES";
			}
		}
		System.out.print(answer);
	}
}
