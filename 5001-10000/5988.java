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
			String[] strs = br.readLine().split("");
			
			if(Integer.parseInt(strs[strs.length-1])%2 != 0) {
				bw.write("odd\n");
			}
			else {
				bw.write("even\n");
			}
		}
		bw.flush();

		br.close();
		bw.close();
	}
}
