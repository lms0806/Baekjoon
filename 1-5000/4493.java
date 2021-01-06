import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			int num = Integer.parseInt(br.readLine());
			
			int a = 0, b = 0;
			for(int j = 0; j < num; j++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				String stra = st.nextToken();
				String strb = st.nextToken();
				
				if(stra.equals("R") && strb.equals("S")) {
					a++;
				}
				else if(stra.equals("P") && strb.equals("R")) {
					a++;
				}
				else if(stra.equals("S") && strb.equals("P")) {
					a++;
				}
				else if(!stra.equals(strb)) {
					b++;
				}
			}
			
			if(a > b) {
				System.out.println("Player 1");
			}
			else if(a == b) {
				System.out.println("TIE");
			}
			else {
				System.out.println("Player 2");
			}
		}
	}
}
