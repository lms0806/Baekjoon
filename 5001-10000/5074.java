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
			String a = st.nextToken(), b = st.nextToken();
			
			if(a.equals("00:00") && b.equals("00:00")) {
				break;
			}
			
			int a1 = Integer.parseInt(a.split(":")[0]), a2 = Integer.parseInt(a.split(":")[1]);
			int b1 = Integer.parseInt(b.split(":")[0]), b2 = Integer.parseInt(b.split(":")[1]);
			
			a1 += b1;
			a2 += b2;
			
			if(a2 >= 60) {
				a2 -= 60;
				a1++;
			}
			int n = 0;
			if(a1 / 24 != 0) {
				n = a1 / 24;
				a1 %= 24;
			}
			
			sb.append(String.format("%02d", a1)).append(":").append(String.format("%02d", a2));
			if(n != 0) {
				sb.append(" +").append(n);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
