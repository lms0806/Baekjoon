import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		ArrayList<String> arr = new ArrayList<>();
		
		String s = br.readLine();
		for(int i = 0; i < s.length(); i+=3) {
			String str = s.substring(i, i + 3);
			if(arr.contains(str)) {
				break;
			}
			arr.add(str);
		}
		
		StringBuilder sb = new StringBuilder();
		if(arr.size() < s.length() / 3) {
			sb.append("GRESKA");
		}
		else {
			int p = 13, k = 13, h = 13, t = 13;
			for(String str : arr) {
				char ch = str.charAt(0);
				
				if(ch == 'P') {
					p--;
				}
				else if(ch == 'K') {
					k--;
				}
				else if(ch == 'H') {
					h--;
				}
				else {
					t--;
				}
			}
			sb.append(p).append(" ").append(k).append(" ").append(h).append(" ").append(t);
		}
		System.out.print(sb);
	}
}
