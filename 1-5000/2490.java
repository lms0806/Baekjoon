import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			int sum = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 4; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			
			sb.append(sum == 1 ? 'C' : sum == 2 ? 'B' : sum == 3 ? 'A' : sum == 4 ? 'E' : 'D').append("\n");
		}
		System.out.print(sb);
	}
}
