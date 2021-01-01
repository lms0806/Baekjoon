import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = "";
		while(true) {
			str = br.readLine().trim().toLowerCase();
			
			if(str.equals("#")) {
				break;
			}
			
			int count = 0;
			String[] strs = str.split("");
			for(int i = 0; i < strs.length; i++) {
				if(strs[i].equals("a") || strs[i].equals("e") || strs[i].equals("i") || strs[i].equals("o") || strs[i].equals("u")) {
					count++;
				}
			}
			bw.write(count + "\n");
		}
		
		bw.flush();

		br.close();
		bw.close();
	}
}
