import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int number = Integer.parseInt(st.nextToken());
			int[] num = new int[number];
			num[0] = Integer.parseInt(st.nextToken());
			int min = num[0],max = num[0],sub = 0;
			for(int j = 1; j < number; j++) {
				num[j] = Integer.parseInt(st.nextToken());
				min = Math.min(num[j], min);
				max = Math.max(num[j], max);
			}
			
			Arrays.sort(num);
			
			for(int j = 1; j < number; j++) {
				if(sub < Math.abs(num[j] - num[j-1])) {
					sub = Math.abs(num[j] - num[j-1]);
				}
			}
			
			sb.append("Class ").append(i+1).append("\n");
			sb.append("Max ").append(max).append(", Min ").append(min).append(", Largest gap ").append(sub).append("\n");
		}
		System.out.println(sb);
	}
}
