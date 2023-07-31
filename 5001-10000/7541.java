import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		int[] arr = {9, 3, 7};
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= size; t++) {
			char[] c = br.readLine().toCharArray();
			
			int idx = 0, qidx = 0;
			int num = 0, sum = 0;
			for(int i = c.length - 1; i >= 0; i--) {				
				if(c[i] != '?') {
					sum += (c[i] - '0') * arr[idx++];
				}
				else {
					qidx = i;
					num = arr[idx++];
				}
				
				if(idx == arr.length) {
					idx = 0;
				}
			}
			
			for(int i = 0; i <= 9; i++) {
				if((num * i + sum) % 10 == 0) {
					c[qidx] = (char)(i + '0');
					break;
				}
			}
			sb.append("Scenario #").append(t).append(":\n").append(new String(c)).append("\n\n");
		}
		System.out.print(sb);
	}
}
