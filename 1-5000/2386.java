import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if(str.equals("#")) {
				break;
			}
			else {
				int answer = 0;
				while(st.hasMoreTokens()) {
					String[] text = st.nextToken().split("");
					for(int i = 0; i < text.length; i++) {
						if(text[i].toLowerCase().equals(str)) {
							answer++;
						}
					}
				}
				sb.append(str).append(" ").append(answer).append("\n");
			}
		}
		System.out.println(sb);
	}
}
