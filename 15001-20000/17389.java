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
		
		String[] strs = br.readLine().split("");
		int sum = 0,bonus = 0;
		for(int i = 0; i < size; i++) {
			if(strs[i].equals("O")) {
				sum += i + 1 + bonus;
				bonus++;
			}
			else {
				bonus=0;
			}
		}
		
		bw.write(sum + "\n");
		bw.flush();

		br.close();
		bw.close();
	}
}
