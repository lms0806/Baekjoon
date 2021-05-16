import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		TreeMap<String, Integer> map = new TreeMap<>();
		
		while(size --> 0) {
			String str = br.readLine();
			str = str.substring(str.indexOf(".")+1);
			
			map.put(str, map.get(str) == null ? 1 : map.get(str)+1);
		}
		
		StringBuilder sb = new StringBuilder();
		for(String key : map.keySet()) { 
			sb.append(key).append(" ").append(map.get(key)).append("\n"); 
		}
		System.out.print(sb);
	}
}
