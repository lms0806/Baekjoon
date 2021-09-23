import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		String[] s = new String[size];
		for(int i = 0; i < size; i++) {
			s[i] = br.readLine();
		}
		
		Arrays.sort(s);
		
		int answer = 0;
		for(int i = 0; i < s.length; i++) {
			boolean b = true;
			for(int j = 0; j < s.length; j++) {
				if(i != j && !s[j].equals("") && s[i].startsWith(s[j])) {
					s[j] = "";
					b = false;
					break;
				}
			}
			if(b) {
				answer++;
			}
		}
		System.out.print(answer);
	}
}
