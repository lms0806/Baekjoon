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
			int sum = 0;
			String[] str = br.readLine().split(",");
			for(int j = 0; j < str.length; j++) {
				sum += Integer.parseInt(str[j]);
			}
			bw.write(sum + "\n");
		}
		
		bw.flush();

		br.close();
		bw.close();
	}
}
