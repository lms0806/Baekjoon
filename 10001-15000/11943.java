import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int[] apple = new int[2], orange = new int[2];
		
		for(int i = 0; i < 2; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			apple[i] = Integer.parseInt(st.nextToken());
			orange[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.print(Math.min(apple[1] + orange[0], apple[0] + orange[1]));
	}
}
