import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		String[] strs = str.split("/");
		
		int[] num = new int[strs.length];
		
		for(int i = 0; i < strs.length; i++) {
			num[i] = Integer.parseInt(strs[i]);
		}
		
		System.out.print(num[0] + num[2] < num[1] || num[1] == 0 ? "hasu" : "gosu");
	}
}
