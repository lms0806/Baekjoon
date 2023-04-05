import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		double k = Double.parseDouble(st.nextToken());
		double x = Double.parseDouble(st.nextToken()), y = Double.parseDouble(st.nextToken());
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			double x2 = Double.parseDouble(st.nextToken()), y2 = Double.parseDouble(st.nextToken());
			
			double dist = Math.sqrt(Math.pow(x2 - x, 2) + Math.pow(y2 - y, 2));
			
			if(dist > k) {
				answer++;
			}
		}
		System.out.print(answer);	
	}
}
