import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			String[] strs = br.readLine().split(" ");
			String str = "";
			for(int j = strs.length - 1; j >= 0; j--) {
				str += strs[j] + " ";
			}
			sb.append("Case #").append(i+1).append(": ").append(str).append("\n");
		}
		System.out.print(sb);
	}
}
