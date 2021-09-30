import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String[] str = st.nextToken().split(":");	
			int h = Integer.parseInt(str[0]), m = Integer.parseInt(str[1]), s = Integer.parseInt(str[2]);

			str = st.nextToken().split(":");
			int h1 = Integer.parseInt(str[0]), m1 = Integer.parseInt(str[1]), s1 = Integer.parseInt(str[2]);
	
			int answer = 0;
			while(true) {
				if((h * 10000 + m * 100 + s) % 3 == 0) {
					answer++;
				}
				
				if(h == h1 && m == m1 && s == s1) {
					break;
				}
				
				s++;
				
				if(s == 60) {
					m++;
					s = 0;
				}
				if(m == 60) {
					h++;
					m = 0;
				}
				if(h == 24) {
					h = 0;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
