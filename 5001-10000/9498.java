import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException,IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int a = Integer.parseInt(br.readLine());
        
		StringBuilder sb = new StringBuilder();
		if(a > 89) {
            		sb.append("A");
		}
		else if(a > 79 && a < 90) {
            		sb.append("B");
		}
		else if(a > 69 && a < 80) {
            		sb.append("C");
		}
		else if(a > 59 && a < 70) {
            		sb.append("D");
		}
		else {
            		sb.append("F");
		}
        	System.out.print(sb);
	}
}
