import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		String a = inttostr(Integer.parseInt(st.nextToken()));
		String b = inttostr(Integer.parseInt(st.nextToken()));
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 16; i++) {
			sb.append(a.charAt(i)).append(b.charAt(i));
		}
		
		System.out.print(Long.parseLong(sb.toString(), 2));
	}
	
	public static String inttostr(int x) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 16; i++) {
			sb.append((x & (1 << i)) > 0 ? 1 : 0);
		}
		return sb.reverse().toString();
	}
}
