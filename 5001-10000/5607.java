import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 5); 
		
		int t = Integer.parseInt(br.readLine());
		
		int suma = 0, sumb = 0;
		while(t --> 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			
			if(a > b) {
				suma += a + b;
			}
			else if(a < b){
				sumb += a + b;
			}
			else {
				suma += a;
				sumb += b;
			}
		}
		System.out.print(suma + " " + sumb);
	}
}
