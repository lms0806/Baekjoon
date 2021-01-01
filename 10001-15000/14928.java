import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String arr = br.readLine();
		long result = 0;
	    
		for(int i = 0; i < arr.length(); i++) {
			result = (result * 10 + (arr.charAt(i) - '0')) % 20000303;
		}
		bw.write(result + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
