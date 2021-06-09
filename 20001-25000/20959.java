import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		String[] str = br.readLine().replaceAll("[a-z]", " ").split(" ");
		
		ArrayList<String> arr = new ArrayList<>();
		for(int i = 0; i < str.length; i++) {
			if(!str[i].equals("") && !arr.contains(str[i])) {
				arr.add(str[i]);
			}
		}
		System.out.print(arr.size());
	}
}
