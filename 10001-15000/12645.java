import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= test; t++) {
			char[] ch = br.readLine().toCharArray();
			
			boolean check = nextPermutation(ch.length, ch);
			
			if(!check) {
				int idx = 1;
				while(ch[0] == '0') {
					char temp = ch[0];
					ch[0] = ch[idx];
					ch[idx] = temp;
					idx++;
				}
			}
			
			sb.append(String.format("Case #%d: ", t));
			for(char c : ch) {
				sb.append(c);
				
				if(!check) {
					check = true;
					sb.append(0);
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
	
	private static boolean nextPermutation(int n, char[] ch) {
		int idx = n;
		for (int i = n - 1; i > 0; i--) {
			if (ch[i - 1] < ch[i]) {
				idx = i;
				break;
			}
		}

		if (idx == 0 || idx == n) {
			Arrays.sort(ch);
			return false;
		}

		for (int i = n - 1; i >= idx; i--) {
			if (ch[idx - 1] < ch[i]) {
				char temp = ch[idx - 1];
				ch[idx - 1] = ch[i];
				ch[i] = temp;
				break;
			}
		}
		
		Arrays.sort(ch, idx, n);
		
		return true;
	}
}
