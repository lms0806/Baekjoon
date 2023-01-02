import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		st.nextToken();
		String a = st.nextToken(), b = st.nextToken();
		
		int[] alphaa = new int[26], alphab = new int[26];
		
		int r = 0, s = 0;
		for(int i = 0; i < a.length(); i++) {
			char ca = a.charAt(i), cb = b.charAt(i);
			
			if(ca == cb) {
				r++;
			}
			else {
				alphaa[ca - 'A']++;
				alphab[cb - 'A']++;
			}
		}
		
		for(int i = 0; i < 26; i++) {
			s += Math.min(alphaa[i], alphab[i]);
		}
		
		System.out.print(r + " " + s);
	}
}
