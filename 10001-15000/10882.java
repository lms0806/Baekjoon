import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String[] s = st.nextToken().split(":");
		int h = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]);
		double utc = splits(st.nextToken());
		
		h -= (int)utc;
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			double utcs = splits(br.readLine());
			
			int ah = h, am = m;
			if(utc != (int)utc) {
				am += utc < 0 ? 30 : -30;
			}
			
			ah += (int)utcs;
			if(utcs != (int)utcs) {
				am += utcs > 0 ? 30 : -30;
			}
			
			if(am < 0) {
				am += 60;
				ah--;
			}
			if(am >= 60) {
				am -= 60;
				ah++;
			}
			
			if(ah < 0) {
				ah += 24;
			}
			if(ah >= 24) {
				ah -= 24;
			}
			sb.append(print(ah)).append(":").append(print(am)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static double splits(String s) {
		return Double.parseDouble(s.substring(3));
	}
	
	public static String print(int n) {
		return String.format("%02d", n);
	}
}
