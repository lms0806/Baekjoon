import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		int a = 0, b = 1, c = 0;
		
		for(int i = 2; i < num+1; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		if(num == 1) {
			c = 1;
		}
		
		bw.write(c + "\n");
		bw.flush();

		br.close();
		bw.close();
	}
}
