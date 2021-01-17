import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			int num = Integer.parseInt(br.readLine());
			
			int min = 1000000, max = -1000000;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < num; j++) {
				int number = Integer.parseInt(st.nextToken());
				min = Math.min(min, number);
				max = Math.max(max, number);
			}
			System.out.println(min + " " + max);
		}
		
	}
}
