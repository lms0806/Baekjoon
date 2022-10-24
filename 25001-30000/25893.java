import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int[] arr = new int[3];
			
			int count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				if(arr[i] >= 10) {
					count++;
				}
				sb.append(arr[i]).append(" ");
			}
			
			sb.append("\n").append(count == 0 ? "zilch" : count == 1 ? "double" : count == 2 ? "double-double" : "triple-double").append("\n\n");
		}
		System.out.print(sb);
	}
}
