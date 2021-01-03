import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			int a = Integer.parseInt(br.readLine());
			
			int max = a;
			while(a != 1) {
				if(a % 2 == 0) {
					a/=2;
				}
				else if(a % 2 != 0) {
					a*=3;
					a++;
				}
				max = Math.max(max, a);
			}
			
			bw.write(max + "\n");
		}
		bw.flush();

		br.close();
		bw.close();
	}
}
