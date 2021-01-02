import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			bw.write("1");
		}
		for(int i = 1; i < n; i++) {
			bw.write("0");
		}
		
		bw.flush();

		br.close();
		bw.close();
	}
}
