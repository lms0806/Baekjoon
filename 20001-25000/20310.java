import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		int zero = 0, one = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == '0') {
				zero++;
			}
			else if(ch == '1') {
				one++;
			}
		}
		
		zero /= 2;
		one /= 2;
		
		StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
        	char ch = str.charAt(i);
        	
            if(ch == '0' && zero != 0){
                sb.append(0);
                zero--;
            } else if(ch == '1'){
            	if(one == 0) {
            		sb.append(1);
            	}
            	else {
            		one--;
            	}
            }
        }

        System.out.print(sb);
	}
}
