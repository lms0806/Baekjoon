import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strs = br.readLine().split(" ");
		
		int count = 0;
		for(int i = 0; i < strs.length; i++) {
			int num = Integer.parseInt(strs[i]);
			
			if(num > 0) {
				count++;
			}
		}
		
		bw.write(count + "\n");
		bw.flush();

		br.close();
		bw.close();
	}
}
