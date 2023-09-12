import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] str = {"give you up", "let you down", "run around and desert you", "make you cry", "say goodbye", "tell a lie and hurt you", "stop"};
		
		int t = Integer.parseInt(br.readLine());
		
		boolean flag = true;
		while(t --> 0) {
			String s = br.readLine();
			
			if(s.startsWith("Never gonna ")) {
				boolean check = false;
				for(int i = 0; i < str.length; i++) {
					if(s.equals("Never gonna " + str[i])) {
						check = true;
						break;
					}
				}
				
				if(!check) {
					flag = false;
					break;
				}
			}
			else {
				flag = false;
				break;
			}
		}
		System.out.print(flag ? "No" : "Yes");
	}
}
