import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		StringBuilder sb = new StringBuilder();
		int size = 0;
		while((size = Integer.parseInt(br.readLine())) != 0) {
			String[] strs = new String[size];
			
			for(int i = 0; i < size; i++) {
				strs[i] = br.readLine();
			}
			
			Arrays.sort(strs, new Comparator<String>() {
				public int compare(String o1, String o2) {
					return o1.toLowerCase().compareTo(o2.toLowerCase());
				}
			});
			sb.append(strs[0]).append("\n");
		}
		System.out.print(sb);
	}
}
