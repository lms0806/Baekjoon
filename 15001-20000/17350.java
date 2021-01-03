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
		
		String answer = "뭐야?";
		for(int i = 0; i < size; i++) {
			String str = br.readLine();
			
			if(str.equals("anj")) {
				answer = "뭐야;";
			}
		}
		
		bw.write(answer);
		bw.flush();

		br.close();
		bw.close();
	}
}
