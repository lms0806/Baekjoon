import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int n = Integer.parseInt(br.readLine());
		
		LinkedList<Integer> arr = new LinkedList<>();
		for(int i = 1; i <= n; i++) {
			arr.add(i);
		}
		
		while(arr.size() != 1) {
			arr.remove(0);
			arr.add(arr.remove(0));
		}
		
		System.out.println(arr.get(0));
	}
}
