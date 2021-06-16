import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			
			int[] count = new int[2];
			boolean b = true;
			for(char ch : s.toCharArray()) {
				if(ch == '\''){
					count[b ? 0 : 1]++;
				}
				else {
					b = false;
				}
			}

			sb.append(s.substring(count[0] * 2, s.length() - (count[1] * 2)));
		}
		System.out.print(sb);
	}
}
