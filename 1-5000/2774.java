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
			int count = 0;
			int[] num = new int[10];
			String str = br.readLine();
			String[] strs = str.split("");
			
			for(int j = 0; j < strs.length; j++) {
				num[Integer.parseInt(strs[j])]++;
			}
			
			for(int j = 0; j < num.length; j++) {
				if(num[j] != 0) {
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
