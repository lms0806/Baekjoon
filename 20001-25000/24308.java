import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String str = s.startsWith("+") || s.startsWith("-") ? s.substring(1) : s;
		
		String answer = null;
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j < str.length(); j++) {
				for(char k = '0'; k <= '9'; k++) {
					if(str.charAt(i) == k || (i == 0 && k == '0')) {
						continue;
					}
					
					for(char l = '0'; l <= '9'; l++) {
						if(str.charAt(j) == l) {
							continue;
						}
						
						char[] ch = str.toCharArray();
						ch[i] = k;
						ch[j] = l;
						
						int num = 0;
						for(char c : ch) {
							num += c - '0';
						}
						
						if(num % 3 == 0 && (ch[ch.length - 1] - '0') % 2 == 0) {							
							String change = (s.startsWith("-") ? "-" : "") + new String(ch);	

							if(answer == null || compare(answer, change) > 0) {
								answer = change;
							}
						}
					}
				}
			}
		}
		System.out.print(answer);
	}

	public static int compare(String a, String b) {
        boolean negA = a.startsWith("-"), negB = b.startsWith("-");

        return !negA && !negB ? b.compareTo(a) : negA && negB ? a.substring(1).compareTo(b.substring(1)) : negA ? -1 : 1;
    }
}
