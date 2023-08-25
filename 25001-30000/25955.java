import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static char[] ch = {'B', 'S', 'G', 'P', 'D'};
	static int[] num = {1000, 2000, 3000, 4000, 5000};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			String s = st.nextToken();
			
			for(int j = 0; j < ch.length; j++) {
				if(s.charAt(0) == ch[j]) {
					arr[i] += num[j];
					break;
				}
			}
			
			arr[i] += 1000 - Integer.parseInt(s.substring(1));
		}
		
		System.out.print(solve(arr));
	}
	
	public static String solve(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = arr.length - 1; j > i ; j--) {
				if(arr[i] > arr[j]) {
					StringBuilder sb = new StringBuilder();
					
					sb.append("KO").append("\n");
					sb.append(ch[arr[j] / 1000 - 1]).append(1000 - arr[j] % 1000).append(" ").append(ch[arr[i] / 1000 - 1]).append(1000 - arr[i] % 1000);
					
					return sb.toString();
				}
			}
		}
		return "OK";
	}
}
