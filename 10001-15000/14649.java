import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double n = Double.parseDouble(br.readLine());
		
		int t = Integer.parseInt(br.readLine());
		
		int[] arr = new int[101]; 
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int num = Integer.parseInt(st.nextToken());
			char c = st.nextToken().charAt(0);
			
			int s = c == 'L' ? 1 : num + 1;
			int e = c == 'L' ? num : 101;
			
			for(int i = s; i < e; i++) {
				arr[i]++;
			}
		}
		
		double[] count = new double[3];
		for(int i = 1; i < 101; i++) {
			count[arr[i] % 3]++;
		}
		
		StringBuilder sb = new StringBuilder();
		for(double c : count) {
			sb.append(String.format("%.2f", n / 100.0 * c)).append("\n");
		}
		System.out.print(sb);
	}
}
