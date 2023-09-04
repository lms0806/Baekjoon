import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int n = Integer.parseInt(br.readLine());
		
		int count = 0;
		double answer = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(n --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num >= 0) {
				count++;
				answer += num;
			}
		}
		
		System.out.print(answer / count);
	}
}
