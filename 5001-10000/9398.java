import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	    
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		while(t --> 0) {
			sb.append(solve(br.readLine())).append("\n");
		}
		System.out.print(sb);
	}
	
	public static int solve(String s) {
		int min = 200;
		for(int i = 0; i < s.length(); i++) {
			for(int j = i + 1; j <= s.length(); j++) {
				if(j - i >= 6) {
					boolean az = false, AZ = false, zeronine = false;
					String str = s.substring(i, j);
					
					for(char c : str.toCharArray()) {
						if(c >= 'a' && c <= 'z') {
							az = true;
						}
						else if(c >= 'A' && c <= 'Z') {
							AZ = true;
						}
						else if(c >= '0' && c <= '9') {
							zeronine = true;
						}
					}
					
					if(az && AZ && zeronine && min > str.length()) {
						min = str.length();
					}
				}
			}
		}
		return min == 200 ? 0 : min;
	}
}
