import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int answer = 0;
		for(int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			answer += s.equals("Es") ? num * 21 : num * 17;
		}
		System.out.print(answer);
	}
}
