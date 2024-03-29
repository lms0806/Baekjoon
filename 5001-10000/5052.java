import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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
			
			Arrays.sort(strs);
			
			sb.append(solve(strs)).append("\n");
		}
		System.out.print(sb);
	}
	
	public static String solve(String[] strs) {
		for(int i = 1; i < strs.length; i++) {
			if(strs[i].startsWith(strs[i-1])) {
				return "NO";
			}
		}
		return "YES";
	}
}
