import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int c = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			double r = Double.parseDouble(st.nextToken()) / 100;
			
			int[] select = new int[b];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < b; i++) {
				select[i] = Integer.parseInt(st.nextToken()) - 1;
			}
			
			int[] arr = new int[c];
			while(n --> 0) {
				st = new StringTokenizer(br.readLine());
				
				arr[Integer.parseInt(st.nextToken()) - 1] += Integer.parseInt(st.nextToken()) * r;
			}
			
			int answer = 0;
			for(int s : select) {
				answer += arr[s];
			}
			
			sb.append("Data Set ").append(t).append(":\n").append(answer).append("\n\n");
		}
		System.out.print(sb);
	}
}
