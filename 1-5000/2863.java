import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		double a = Double.parseDouble(st.nextToken()), b = Double.parseDouble(st.nextToken());
		st = new StringTokenizer(br.readLine());
		double c = Double.parseDouble(st.nextToken()), d = Double.parseDouble(st.nextToken());
		
		double[] num = {a/c + b/d, c/d + a/b, d/b + c/a, b/a + d/c};
		
		double max = num[0];
		int answer = 0;
		for(int i = 1; i < 4; i++) {
			if(max < num[i]) {
				max = num[i];
				answer = i;
			}
		}
		System.out.print(answer);
	}
}
