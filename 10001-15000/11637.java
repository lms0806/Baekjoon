import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int n = Integer.parseInt(br.readLine());
			
			int[] num = new int[n];
			
			double sum = 0;
			for(int i = 0; i < n; i++) {
				num[i] = Integer.parseInt(br.readLine());
				sum += num[i];
			}
			
			int answer = 0, count = 0, witch = 0;
			for(int i = 0; i < n; i++) {
				if(answer < num[i]) {
					answer = num[i];
					count = 0;
					witch = i + 1;
				}
				else if(answer == num[i]) {
					count++;
				}
			}
			
			if(count != 0) {
				sb.append("no winner");
			}
			else {
				sb.append(sum / 2 > sum - num[witch - 1] ? "majority" : "minority").append(" winner " + witch);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
