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
		for(int i = 1; i <= size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] num = new int[3];
			
			num[0] = Integer.parseInt(st.nextToken());
			num[1] = Integer.parseInt(st.nextToken());
			num[2] = Integer.parseInt(st.nextToken());
			
			Arrays.sort(num);
			
			sb.append("Case #").append(i).append(": ");
			if(num[2] >= num[0] + num[1]) {
				sb.append("invalid!");
			}
			else if(num[0] == num[1] && num[1] == num[2]) {
				sb.append("equilateral");
			}
			else if(num[0] == num[1] || num[1] == num[2] || num[0] == num[2]) {
				sb.append("isosceles");
			}
			else {
				sb.append("scalene");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
