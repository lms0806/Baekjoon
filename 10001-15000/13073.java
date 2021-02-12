import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		int num;
		
        	StringBuilder sb = new StringBuilder();
		while(size-->0) {
			num = Integer.parseInt(br.readLine());
			
			sb.append(num*(num+1)/2).append(" ").append(num*num).append(" ").append(num*(num+1)).append("\n");
		}
        	System.out.print(sb);
	}
}
