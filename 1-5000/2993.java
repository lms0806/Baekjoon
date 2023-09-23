import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String s = br.readLine();
		
		ArrayList<StringBuilder> arr = new ArrayList<>();
		for(int i = 1; i < s.length() - 1; i++) {
			for(int j = i + 1; j < s.length(); j++) {
				StringBuilder sb = new StringBuilder(s.substring(0, i)).reverse();
				sb.append(new StringBuilder(s.substring(i, j)).reverse()).append(new StringBuilder(s.substring(j, s.length())).reverse());
				arr.add(sb);
			}
		}
		
		Collections.sort(arr);
		
		System.out.print(arr.get(0));
	}
}
