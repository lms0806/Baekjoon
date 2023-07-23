import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		boolean[] set = new boolean[20];
		
		int t = Integer.parseInt(br.readLine());
		
		StringBuilder sb  = new StringBuilder();
		while(t --> 0) {
			String str = br.readLine();
			char ch = str.charAt(0);
			
			if(ch == 'a') {
				if(str.charAt(1) == 'd') {
                    int idx = Integer.parseInt(str.substring(4, str.length())) - 1;
                    
					if(!set[idx]) {
						set[idx] = true;
					}
				}
				else {
					for(int i = 0; i < 20; i++) {
						set[i] = true;
					}
				}
			}
			else if(ch == 'e'){
				for(int i = 0; i < 20; i++) {
					set[i] = false;
				}
			}
			else if(ch == 'r') {
                int idx = Integer.parseInt(str.substring(7, str.length())) - 1;
                
				if(set[idx]) {
					set[idx] = false;
				}
			}
			else if(ch == 'c') {
				sb.append(set[Integer.parseInt(str.substring(6, str.length()))-1] ? 1 : 0).append("\n");
			}
			else if(ch == 't') {
				int idx = Integer.parseInt(str.substring(7, str.length())) - 1;
				
				set[idx] = !set[idx];
			}
		}
		System.out.print(sb);
	}
}
