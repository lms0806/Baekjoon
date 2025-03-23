import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int f = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), e = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int needF = Integer.parseInt(st.nextToken()), needC = Integer.parseInt(st.nextToken()), needE = Integer.parseInt(st.nextToken()), needB = Integer.parseInt(st.nextToken());
		
		int q = Integer.parseInt(br.readLine());
		
		int cockie = 0;
		StringBuilder sb = new StringBuilder();
		while(q --> 0) {
			st = new StringTokenizer(br.readLine());
			int op = Integer.parseInt(st.nextToken()), i = Integer.parseInt(st.nextToken());
			
			if(op == 1) {
				if(needF * i <= f && needC * i <= c && needE * i <= e && needB * i <= b) {
					cockie += i;
					f -= needF * i;
					c -= needC * i;
					e -= needE * i;
					b -= needB * i;
					sb.append(cockie);
				}
				else {
					sb.append("Hello, siumii");
				}
			}
			else if(op == 2) {
				f += i;
				sb.append(f);
			}
			else if(op == 3) {
				c += i;
				sb.append(c);
			}
			else if(op == 4) {
				e += i;
				sb.append(e);
			}
			else {
				b += i;
				sb.append(b);
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
