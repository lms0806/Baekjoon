import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String str = br.readLine();
		
		int l = 0, o = 0, v = 0, e = 0;
		
		for(char ch : str.toCharArray()) {
			if(ch == 'L') {
				l++;
			}
			else if(ch == 'O') {
				o++;
			}
			else if(ch == 'V') {
				v++;
			}
			else if(ch == 'E') {
				e++;
			}
		}
		
		int size = Integer.parseInt(br.readLine());
		
		int max = 0;
		ArrayList<String> arr = new ArrayList<>();
		while(size --> 0) {
			int l1 = l, o1 = o, v1 = v, e1 = e;
			
			String s = br.readLine();
			for(char ch : s.toCharArray()) {
				if(ch == 'L') {
					l1++;
				}
				else if(ch == 'O') {
					o1++;
				}
				else if(ch == 'V') {
					v1++;
				}
				else if(ch == 'E') {
					e1++;
				}
			}
			
			int check = ((l1 + o1) * (l1 + v1) * (l1 + e1) * (o1 + v1) * (o1 + e1) * (v1 + e1)) % 100;
			
			if(check > max) {
				max = check;
				arr.clear();
				arr.add(s);
			}
			else if(check == max) {
				arr.add(s);
			}
		}
		Collections.sort(arr);
		
		System.out.print(arr.get(0));
	}
}
