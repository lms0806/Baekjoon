import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			String s = br.readLine();
			
			if(!arr.contains(s)) {
				arr.add(s);
			}
		}
		
		int answer = 0;
		int s = 0, e = 0;
		for(int i = 0; i < n; i++) {
			String a = arr.get(i);
			
			for(int j = i + 1; j < n; j++) {
				String b = arr.get(j);
				
				int count = 0;
				int len = a.length() < b.length() ? a.length() : b.length();
				for(int k = 0; k < len; k++) {
					if(a.charAt(k) == b.charAt(k)) {
						count++;
					}
					else {
						break;
					}
				}
				
				if(answer < count) {
					answer = count;
					s = i;
					e = j;
				}
			}
		}
		System.out.print(arr.get(s) + "\n" + arr.get(e));
	}
}
