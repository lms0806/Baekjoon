import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String[] start = st.nextToken().split(":"), end = st.nextToken().split(":");
		int sh = Integer.parseInt(start[0]), sm = Integer.parseInt(start[1]);
		int eh = Integer.parseInt(end[0]), em = Integer.parseInt(end[1]);
		int dif = (eh - sh) * 60 + (em - sm);
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), t = Integer.parseInt(st.nextToken());
		
		int day = (dif - 1) / t;
		System.out.print((n / day) + "\n" + solve(sh, sm, (n % day + 1) * t));
	}
	
	public static String solve(int sh, int sm, int plus) {
		sm += plus;
		if(sm >= 60) {
			sh += sm / 60;
			sm %= 60;
		}
		
		if(sh >= 24) {
			sh %= 24;
		}
		
		return String.format("%02d:%02d", sh, sm);
	}
}
