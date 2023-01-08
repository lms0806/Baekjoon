import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		System.out.print(solve(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
	}
	
	public static String solve(int a, int b) {
		int[] arr = {a + b, a - b, a * b};
		
		Arrays.sort(arr);
		
		if(arr[1] == arr[2]) {
			return "NIE";
		}
		else {
			StringBuilder sb = new StringBuilder();
			sb.append(change(a));
			sb.append(arr[2] == a + b ? "+" : arr[2] == a - b ? "-" : "*");
			sb.append(change(b)).append("=");
			sb.append(arr[2] == a + b ? change(a + b) : arr[2] == a - b ? change(a - b) : change(a * b));
			return sb.toString();
		}
	}
	
	public static String change(int n) {
		return n < 0 ? "(" + n + ")" : n + "";
	}
}
