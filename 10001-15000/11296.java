import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		String[] salecolor = {"R", "G", "B", "Y", "O", "W"};
		int[] salecount = {45, 30, 20, 15, 10, 5};
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			double n = Double.parseDouble(st.nextToken());
			
			double sale = 0.0;
			String color = st.nextToken();
			
			for(int i = 0; i < salecolor.length; i++) {
				if(color.equals(salecolor[i])) {
					n = n * (100 - salecount[i]) / 100;
					break;
				}
			}
			
			if(st.nextToken().equals("C")) {
				n = n * 95 / 100;
			}
			
			sb.append("$");
			if(st.nextToken().equals("C")) {
				sb.append(String.format("%.1f", n) + "0");
			}
			else {
				sb.append(String.format("%.2f", n));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
