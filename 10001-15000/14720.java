import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		int answer = 0;
		while(size --> 0) {
			if(answer % 3 == Integer.parseInt(st.nextToken())) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
