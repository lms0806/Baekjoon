import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int num = Integer.parseInt(br.readLine());
		
		char last = ' ';
		int count = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num; i++) {
			String str = st.nextToken();
			if(last != ' ' && last != str.charAt(0)) {
				sb.append(0);
				break;
			}
			last = str.charAt(str.length()-1);
			count++;
		}
		if(count == num) {
			sb.append(1);
		}
		System.out.print(sb);
	}
}
