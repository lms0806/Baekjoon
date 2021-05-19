import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(size --> 0) {
			int num = Integer.parseInt(st.nextToken());
			
			int answer = 0;
			for(int i = 1; i < num; i++) {
				if(num%i == 0) {
					answer += i;
				}
			}
			
			sb.append(answer < num ? "Deficient" : answer == num ? "Perfect" : "Abundant").append("\n");
		}
		System.out.print(sb);
	}
}
