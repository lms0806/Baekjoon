import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int answer = 0;
		while(n != 0) {
			String s = String.valueOf(n);
			
			if(s.contains("1")) {
				for(int i = 0; i < s.length(); i++) {
					if(s.charAt(i) == '1') {
						StringBuilder sb = new StringBuilder();
						for(int j = 0; j < s.length(); j++) {
							if(i == j) {
								continue;
							}
							sb.append(s.charAt(j));
						}
						n = sb.length() == 0 ? 0 : Integer.parseInt(sb.toString());
						break;
					}
				}
			}
			else {
				n--;
			}
			answer++;
		}
		System.out.print(answer);
	}
}
