import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine(), b = br.readLine();
		
		int size = Math.max(a.length(), b.length());
		
		char[] ca = new char[size], cb = new char[size];
		
		int idx = size - 1;
		for(int i = a.length() - 1; i >= 0; i--) {
			ca[idx--] = a.charAt(i);
		}
		
		idx = size - 1;
		for(int i = b.length() - 1; i >= 0; i--) {
			cb[idx--] = b.charAt(i);
		}

		StringBuilder sa = new StringBuilder(), sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			if(ca[i] < cb[i]) {
				sb.append(cb[i]);
			}
			else if(ca[i] > cb[i]){
				sa.append(ca[i]);
			}
			else {
				sa.append(ca[i]);
				sb.append(cb[i]);
			}
		}
		
		System.out.print((sa.length() == 0 ? "YODA" : Integer.parseInt(sa.toString())) + "\n" + (sb.length() == 0 ? "YODA" : Integer.parseInt(sb.toString())));
	}
}
