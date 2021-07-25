import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		String str = br.readLine();
		
		String answer = str.substring(0, a - 1);
		for(int i = b - 1; i >= a - 1; i--) {
			answer += str.charAt(i);
		}
		System.out.print(answer + str.substring(b));
	}
}
