import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		String answer = "YES";
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			if(Integer.parseInt(st.nextToken()) % 2 == i % 2) {
				answer = "NO";
				break;
			}
		}
		System.out.print(answer);
	}
}
