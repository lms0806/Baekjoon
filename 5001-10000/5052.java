import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(size --> 0) {
			int num = Integer.parseInt(br.readLine());
			
			String[] strs = new String[num];
			
			for(int i = 0; i < num; i++) {
				strs[i] = br.readLine();
			}
			
			Arrays.sort(strs, new Comparator<String>() {
				public int compare(String o1, String o2) {
					return o1.compareTo(o2);
				}
			});
			
			String answer = "YES";
			for(int i = 1; i < num; i++) {
				if(strs[i].startsWith(strs[i-1])) {
					answer = "NO";
					break;
				}
			}
			sb.append(answer).append("\n");
		}
		System.out.print(sb);
	}
}
