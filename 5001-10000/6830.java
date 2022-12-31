import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s;
		String answer = "";
		int min = 201;
		while((s = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			
			String name = st.nextToken();
			int num = Integer.parseInt(st.nextToken());
			
			if(num < min) {
				min = num;
				answer = name;
			}
		}
		System.out.print(answer);
	}
}
