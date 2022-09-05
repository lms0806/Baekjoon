import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Character> arr = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int t = Integer.parseInt(br.readLine());
			
			if(t == 0) {
				break;
			}
			
			String answer = "";
			int max = -1;
			while(t --> 0) {
				String s = br.readLine();
				
				int count = 0;
				for(int i = 0; i < s.length() - 1; i++) {
					char c = s.charAt(i), c1 = s.charAt(i + 1);
					if(arr.contains(c) && arr.contains(c1) && c == c1) {
						count++;
					}
				}
				
				if(count > max) {
					max = count;
					answer = s;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
