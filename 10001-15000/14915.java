import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		String str = "";
		if(m == 0) {
			sb.append("0\n");
		}
		while(m != 0) {
			if(m%n == 10) {
				str += "A";
			}
			else if(m%n == 11) {
				str += "B";
			}
			else if(m%n == 12) {
				str += "C";
			}
			else if(m%n == 13) {
				str += "D";
			}
			else if(m%n == 14) {
				str += "E";
			}
			else if(m%n == 15) {
				str += "F";
			}
			else {
				str += Integer.toString(m%n);
			}
			m /= n;
		}
		
		sb.append(new StringBuilder(str).reverse().toString());
		System.out.print(sb);
	}
}
