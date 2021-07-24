import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()),b = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		
		int answer = a%b;
		
		for(int i = 0; i < n - 1; i++) {
			answer = answer * 10 % b;
		}
		answer *= 10;
		
		System.out.print(answer / b);
	}
}
