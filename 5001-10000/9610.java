import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		int[] num = new int[5];
		
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			
			if(a == 0 || b == 0) {
				num[4]++;
			}
			else if(a > 0) {
				if(b > 0) {
					num[0]++;
				}
				else{
					num[3]++;
				}
			}
			else {
				if(b > 0) {
					num[1]++;
				}
				else{
					num[2]++;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < num.length-1; i++) {
			sb.append("Q").append(i+1).append(": ").append(num[i]).append("\n");
		}
		sb.append("AXIS: ").append(num[4]);
		System.out.print(sb);
	}
}
