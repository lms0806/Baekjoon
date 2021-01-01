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
		
		String str = "";
		for(int i = Integer.parseInt(arr); i >= 0; i--) {
			str = Integer.toString(i);
			String[] strs = str.split("");
			
			int count = 0;
			for(int j = 0; j < strs.length; j++) {
				if(strs[j].equals("4") || strs[j].equals("7")) {
					count++;
				}
			}
			if(count == strs.length) {
				break;
			}
		}
		
		bw.write(str + "\n");
		
		bw.flush();
		br.close();
		bw.close();
	}
}
