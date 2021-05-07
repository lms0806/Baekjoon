import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			
			sb.append(a).append(" & ").append(b).append(" are ");
			
			if(a.length() != b.length()) {
				sb.append("NOT ");
			}
			else {
				int[] aa = new int[26];
				for(int j = 0; j < a.length(); j++) {
					aa[a.charAt(j) - 'a']++;
					aa[b.charAt(j) - 'a']--;
				}
				
				boolean istrue = true;
				for(int j = 0; j < aa.length; j++) {
					if(aa[j] != 0) {
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
