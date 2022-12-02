import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		int[] dough = {8, 8, 4, 1, 9};
		int[] ingredient = {1, 30, 25, 10};
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			br.readLine();
			
			double min = Double.MAX_VALUE;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 5; i++) {
				double num = Double.parseDouble(st.nextToken());
				min = Math.min(min, num / dough[i]);
			}
			
			int doughs = (int)(min * 16);
			
			int answer = 0;
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 4; i++) {
				answer += Integer.parseInt(st.nextToken()) / ingredient[i];
				
				if(answer > doughs) {
					answer = doughs;
					break;
				}	
			}
			
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
