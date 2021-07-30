import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		String[] str = new String[size];
		
		for(int i = 0; i < size; i++) {
			str[i] = br.readLine();
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str[0].length(); i++) {
			char ch = str[0].charAt(i);
			boolean istrue = true;
			for(int j = 1; j < size; j++) {
				if(str[j].charAt(i) != ch) {
					istrue = false;
					break;
				}
			}
			sb.append(istrue ? ch : "?");
		}
		System.out.print(sb);
	}
}
