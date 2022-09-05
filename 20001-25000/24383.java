import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().replaceAll("1", " ").split(" ");
		
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < str.length; i++) {
			if(str[i].length() != 0) {
				set.add(str[i].length());
			}
		}
		
		System.out.print(set.size());
	}
}
