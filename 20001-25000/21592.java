import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			arr.add(br.readLine());
		}
		
		arr.sort(Comparator.comparing(String::length));
		
		String s = arr.get(0);
		int len = s.length();
		int answer = 0;
		for(int i = 0; i < len; i++) {
			for(int j = i + 1; j <= len; j++) {
				String str = s.substring(i, j);
				
				boolean flag = true;
				for(int k = 1; k < n; k++) {
					if(!arr.get(k).contains(str)) {
						flag = false;
						break;
					}
				}
				
				if(flag) {
					answer = Math.max(answer, str.length());
				}
			}
		}
		System.out.print(answer);
	}
}
