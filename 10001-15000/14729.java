import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		Double[] d = new Double[8];
		
		d[0] = -1.0;
		for(int i = 1; i <= 7; i++) {
			d[i] = Double.parseDouble(br.readLine());
		}
		
		Arrays.sort(d);
		
		for(int i = 8; i <= size; i++) {
			double cur = Double.parseDouble(br.readLine());
			if(cur >= d[7]) {
				continue;
			}
			
			for(int j = 7; j >= 0; j--) {
				if(d[j] <= cur) {
					for(int k = 7; k > j + 1; k--) {
						d[k] = d[k - 1];
					}
					d[j + 1] = cur;
					break;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 7; i++) {
			sb.append(String.format("%.3f", d[i])).append("\n");
		}
		System.out.print(sb);
	}
}
