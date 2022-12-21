import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine(), ",");
			
			String name = st.nextToken();
			
			sb.append(name).append(" - ").append(print(Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String print(int num) {
		StringBuilder sb = new StringBuilder();
		if(num > 60 * 24 * 365) {
			sb.append(num / (60 * 24 * 365)).append(" year(s) ");
			num %= 60 * 24 * 365;
		}
		if(num > 60 * 24) {
			sb.append(num / (60 * 24)).append(" day(s) ");
			num %= 60 * 24;
		}
		if(num > 60) {
			sb.append(num / 60).append(" hour(s) ");
			num %= 60;
		}
		if(num > 0) {
			sb.append(num).append(" minute(s)");
		}
		
		return sb.toString();
	}
}
