import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), f = Integer.parseInt(st.nextToken());
		
		double min = Double.MAX_VALUE;
		int answer = 0;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken()), v = Double.parseDouble(st.nextToken());
			
			double num = (f - x) / v; 
			if(num < min) {
				min = num;
				answer = i;
			}
		}
		System.out.print(answer + 1);
	}
}
