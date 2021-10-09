import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] strs = new String[100];
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			while(st.hasMoreTokens()) {
				strs[count] = st.nextToken();
				count++;
			}
			
			while(true) {
				String str = br.readLine().split(" ")[2];
				
				if(str.equals("the")) {
					break;
				}
				
				for(int j = 0; j < count; j++) {
					if(strs[j].equals(str)) {
						strs[j] = "";
					}
				}
			}
			
			for(String s : strs) {
				if(s != null && !s.equals("")) {
					sb.append(s).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
