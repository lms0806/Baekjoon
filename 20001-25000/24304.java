import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine().trim());
		
		String[] str = br.readLine().replaceAll("[a-zA-Z]", " ").split(" ");
		
		System.out.print(solve(str, n));
	}

	public static String solve(String[] str, int n) {
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < str.length; i++) {
			if(str[i].length() > 0) {
				arr.add(n * Integer.parseInt(str[i]));
			}
		}
		
		if(arr.size() == 0) {
			return "N/A";
		}
		
		StringBuilder sb = new StringBuilder();
		for(int a : arr) {
			sb.append(a).append("\n");
		}
		return sb.toString();
	}
}
