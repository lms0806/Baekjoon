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
			String a = br.readLine();
			String[] as = a.split("");
			
			String str = Integer.toString(Integer.parseInt(a)*Integer.parseInt(a));
			String[] strs = str.split("");
			
			int count = 0;
			for(int j = 0; j < as.length; j++) {
				if(as[as.length-j-1].equals(strs[strs.length-j-1])) {
					count++;
				}
			}
			
			if(count == as.length) {
				bw.write("YES\n");
			}
			else {
				bw.write("NO\n");
			}
		}
		
		bw.flush();

		br.close();
		bw.close();
	}
}
