import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			String[] strs = br.readLine().split(" ");
			String str = "Case #" + (i+1) + ": ";
			for(int j = strs.length - 1; j >= 0; j--) {
				str += strs[j] + " ";
			}
			System.out.println(str);
		}
	}
}
