import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken(), b = st.nextToken();
			
			sb.append(a).append(" & ").append(b).append(" are ");
			
			if(a.length() != b.length()) {
				sb.append("NOT ");
			}
			else {
				int[] aa = new int[26];
				for(int i = 0; i < a.length(); i++) {
					aa[a.charAt(i) - 'a']++;
					aa[b.charAt(i) - 'a']--;
				}
				
				boolean istrue = true;
				for(int n : aa) {
					if(n != 0) {
						istrue = false;
						break;
					}
				}
				sb.append(istrue ? "" : "NOT ");
			}
			sb.append("anagrams.\n");
		}
		System.out.print(sb);
	}
}
