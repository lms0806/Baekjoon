import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		StringBuilder sb = new StringBuilder();
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int m = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(m == a && a == b && b == 0) {
				break;
			}
			
			double aa = m / (double)a * 3600;
			double bb = m / (double)b * 3600;
			int dif = (int)Math.round(Math.abs(aa - bb));
			sb.append(dif / 3600).append(":").append(String.format("%02d", (dif % 3600) / 60)).append(":").append(String.format("%02d", dif % 60)).append("\n");
		}
		System.out.print(sb);
	}
}
