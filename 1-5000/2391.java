import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			String s = br.readLine();
			
			int n = Integer.parseInt(br.readLine());
			
			String answer = "";
			int min = Integer.MAX_VALUE;
			for(int i = 0; i < n; i++) {
				String str = br.readLine();
				
				int count = 0;
				for(int j = 0; j < str.length(); j++) {
					if(str.charAt(j) != s.charAt(j)) {
						count++;
					}
				}
				
				if(min > count) {
					min = count;
					answer = str;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
