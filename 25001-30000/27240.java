import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int max = Math.max(s, t), min = Math.min(s, t);
		
		System.out.print(b < min && max < c ? "City" : max <= b || c <= min ? "Outside" : "Full");
	}
}
