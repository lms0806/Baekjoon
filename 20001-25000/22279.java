import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int t = Integer.parseInt(br.readLine());
		
		double answer = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			answer += Double.parseDouble(st.nextToken()) * Double.parseDouble(st.nextToken());
		}
		System.out.print(answer);
	}
}
