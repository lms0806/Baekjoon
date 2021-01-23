import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		
		String answer = "";
		for(int i = 0; i < n; i++) {
			answer += Integer.toString(n);
			if(answer.length() >= a) {
				answer = answer.substring(0,a);
				break;
			}
		}
		System.out.println(answer);
	}
}
