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
			String[] strs = Integer.toString(a).split("");
			
			String str = "";
			for(int j = strs.length-1; j >= 0; j--) {
				str += strs[j];
			}
			String s = Integer.toString(a + Integer.parseInt(str));
			String[] ss = s.split("");
			
			int count = 0;
			for(int j = 0; j < ss.length/2; j++) {
				if(ss[j].equals(ss[ss.length-j-1])) {
					count++;
				}
			}
			if(count == ss.length/2) {
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
