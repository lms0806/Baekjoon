import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= size; i++) {
			arr.add(i);
		}
		
		while(arr.size() >= 2) {
			for(int i = 0; i < arr.size(); i++) {
				arr.remove(i);
			}
		}
		
		System.out.print(arr.get(0));
	}
}
