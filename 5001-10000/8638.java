import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static String[] arr;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = 0;
		String answer = "";
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(max < num) {
				answer = "";
				max = num;
				answer += (char)(i + 'A');
			}
			else if(max == num) {
				answer += (char)(i + 'A');
			}
		}
		System.out.print(answer);
	}
}
