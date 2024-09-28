import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			int t = Integer.parseInt(br.readLine());
			
			if(t == 0) {
				break;
			}
						
			while(t --> 0) {
				char answer = '*';
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int i = 0; i < 5; i++) {
					if(Integer.parseInt(st.nextToken()) <= 127) {
						if(answer != '*') {
							answer = '*';
							break;
						}
						answer = (char)('A' + i);
					}
				}
				sb.append(answer).append("\n");
			}
		}
		System.out.print(sb);
	}
}
