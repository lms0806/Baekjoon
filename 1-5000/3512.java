import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		int total = 0, bedroom = 0;
		double balcony = 0; 
		while(n --> 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String word = st.nextToken();
			
			if(word.equals("bedroom")) {
				bedroom += a;
			}
			else if(word.equals("balcony")) {
				balcony += a;
			}
			
			total += a;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(total).append("\n").append(bedroom).append("\n");
		sb.append((double)(total - balcony + (balcony / 2)) * c);
		System.out.print(sb);
	}
}
