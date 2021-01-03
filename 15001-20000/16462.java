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
		
		double sum = 0;
		for(int i = 0; i < size; i++) {
			String[] strs = br.readLine().split("");
			
			String str = "";
			for(int j = 0; j < strs.length; j++) {
				if(strs[j].equals("0") || strs[j].equals("6")) {
					strs[j] = "9";
				}
				str+=strs[j];
			}
			double num = Integer.parseInt(str);
			if(num > 100) {
				num = 100;
			}
			sum += num;
		}
		sum/=size;
		
		if(sum >= (int)sum + 0.5) {
			sum++;
		}
		
		bw.write((int)sum+"\n");
		bw.flush();

		br.close();
		bw.close();
	}
}
