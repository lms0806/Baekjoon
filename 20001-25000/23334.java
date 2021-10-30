import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int max = 0;
		String answer = "";
		while(n --> 0) {
			String[] str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]) * 1000000 + Integer.parseInt(str[1]) * 1000 + Integer.parseInt(str[2]);
			
			if(max < a) {
				max = a;
				answer = "";
				for(int i = 3; i < str.length; i++) {
					answer += str[i] + " ";
				}
			}
		}
		System.out.print(answer);
	}
}
