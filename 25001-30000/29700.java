import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int num = Integer.parseInt(st.nextToken());
		
		int answer = 0;
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			for(int j = 0; j <= s.length() - num; j++) {
				boolean flag = true;
				for(int k = 0; k < num; k++) {
					if(s.charAt(j + k) == '1') {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
