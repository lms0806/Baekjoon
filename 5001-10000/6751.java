import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine()) + 1;
		
		while(true) {
			String str = Integer.toString(size);
			boolean istrue = true;
			
			for(int i = 0; i < str.length(); i++) {
				char s = str.charAt(i);
				
				for(int j = 0; j < str.length(); j++) {
					if(i != j) {
						char s1 = str.charAt(j);
						
						if(s == s1) {
							istrue = false;
							break;
						}
					}
				}
				if(!istrue) {
					break;
				}
			}
			
			if(istrue) {
				System.out.print(size);
				break;
			}
			
			size++;
		}
	}
}
