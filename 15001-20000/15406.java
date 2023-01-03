import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		while(true) {
			String s = br.readLine();
			
			if(s.equals("TOTAL")) {
				break;
			}
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
		}
		
		System.out.print(Integer.parseInt(br.readLine()) <= sum ? "PAY" : "PROTEST");
	}
}
