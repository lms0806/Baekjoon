import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			int k = Integer.parseInt(br.readLine());
			
			String a = br.readLine(), b = br.readLine();
			
			int same = 0, other = 0;
			for(int i = 0; i < a.length(); i++) {
				if(a.charAt(i) == b.charAt(i)) {
					same++;
				}
				else {
					other++;
				}
			}
			sb.append(k > same ? (same << 1) + other - k : k + other).append("\n");
		}
		System.out.print(sb);
	}
}
