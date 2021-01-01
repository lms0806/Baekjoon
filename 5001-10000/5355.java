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
			String[] str = br.readLine().split(" ");
			
			double num = Double.parseDouble(str[0]);
			
			for(int j = 1; j < str.length; j++) {
				if(str[j].equals("@")) {
					num*=3;
				}
				else if(str[j].equals("%")) {
					num+=5;
				}
				else {
					num-=7;
				}
			}
			bw.write(String.format("%.2f", num) + "\n");
		}
		
		bw.flush();

		br.close();
		bw.close();
	}
}
