import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int counta = 0, countb = 0;
			int[] a = new int[3], b = new int[3];
			for(int i = 0; i < 3; i++) {
				a[i] = Integer.parseInt(st.nextToken());
				counta += a[i];
				sb.append(a[i]).append(" ");
			}
			for(int i = 0; i < 3; i++) {
				b[i] = Integer.parseInt(st.nextToken());
				countb += b[i];
				sb.append(b[i]).append(" ");
			}
			
			sb.append("\n").append(print(a, b, counta, countb)).append("\n\n");
		}
		System.out.print(sb);
	}
	
	public static String print(int[] a, int[] b, int counta, int countb) {
		if(a[0] > b[0]) {
			if(counta > countb) {
				return "both";
			}
			return "color";
		}
		else if(a[0] == b[0]) {
			if(a[1] > b[1]) {
				if(counta > countb) {
					return "both";
				}
				return "color";
			}
			else if(a[1] == b[1]) {
				if(a[2] > b[2]) {
					if(counta > countb) {
						return "both";
					}
					return "color";
				}
			}
		}
		if(counta > countb) {
			return "count";
		}
		return "none";
	}
}
