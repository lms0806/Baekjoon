import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		String a = st.nextToken(), b = st.nextToken();
		
		int[] alphanum = {3, 2, 1, 2, 4, 3, 1, 3, 1, 1, 3, 1, 3, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < Math.max(a.length(), b.length()); i++) {
			if(i < a.length()) {
				arr.add(alphanum[a.charAt(i) - 'A']);
			}
			if(i < b.length()) {
				arr.add(alphanum[b.charAt(i) - 'A']);
			}
		}
		
		while(true) {
			for(int i = 0; i < arr.size() - 1; i++) {
				arr.set(i, (arr.get(i) + arr.get(i + 1)) % 10);
			}
			
			arr.remove(arr.size() - 1);
			
			if(arr.size() == 2) {
				break;
			}
		}
		
		System.out.print((arr.get(0) * 10 + arr.get(1)) + "%");
	}
}
