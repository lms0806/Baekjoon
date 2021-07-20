import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		ArrayList<BigInteger> arr = new ArrayList<>();
		while(size --> 0) {
			String[] str = br.readLine().split("\\D");
			for(String s : str) {
				if(!s.equals("")) {
					arr.add(new BigInteger(s));
				}
			}
		}
		
		Collections.sort(arr);
		
		StringBuilder sb  = new StringBuilder();
		for(BigInteger n : arr) {
			sb.append(n).append("\n");
		}
		System.out.print(sb);
	}
}
