import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int count = Integer.parseInt(st.nextToken());
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < 2; i++) {
			int n = Integer.parseInt(st.nextToken());
			int num = count / n + (count % n != 0 ? 1 : 0);
			
			min = Math.min(min, num * Integer.parseInt(st.nextToken()));
		}
		System.out.print(min);
	}
}
