import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			if(br.readLine().contains("FBI")) {
				arr.add(i+1);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		if(arr.size() == 0) {
			sb.append("HE GOT AWAY!");
		}
		else {
			for(int i = 0; i < arr.size(); i++) {
				sb.append(arr.get(i)).append(" ");
			}
		}
		System.out.print(sb);
	}
}
