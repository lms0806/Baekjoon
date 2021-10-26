import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			char[] ch = br.readLine().toCharArray();
			Arrays.sort(ch);
			
			str[i] = new String(ch);
		}
		
		Arrays.sort(str);
		
		int answer = 1;
		for(int i = 1; i < n; i++) {
			if(!str[i].equals(str[i - 1])) {
				answer++;
			}
		}
		System.out.print(answer);
	}	
}
