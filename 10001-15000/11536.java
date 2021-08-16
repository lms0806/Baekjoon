import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		String[] str = new String[size];
		
		for(int i = 0; i < size; i++) {
			str[i] = br.readLine();
		}
		
		System.out.print(solve(str));
	}
	
	public static String solve(String[] str) {
		int num = 3;
		for(int i = 0; i < str.length - 1; i++) {
			int n = Math.min(str[i].length(), str[i + 1].length());
			
			for(int j = 0; j < n; j++) {
				char c1 = str[i].charAt(j), c2 = str[i + 1].charAt(j);
				if(c1 < c2) {
					if(num == 0) {
						return "NEITHER";
					}
					else {
						num = 1;
						break;
					}
				}
				else if(c1 > c2) {
					if(num == 1) {
						return "NEITHER";
					}
					else {
						num = 0;
						break;
					}
				}
			}
		}
		
		return num == 0 ? "DECREASING" : "INCREASING";
	}
}
