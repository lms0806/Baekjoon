import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringJoiner;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();
		while(true) {
			String str = br.readLine();
			
			if(str.equals(".")) {
				break;
			}
			
			String[] s = str.replaceAll("[\\.,]", "").split(" ");
			
			HashMap<String, String> stringOrigin = new HashMap<>();
			ArrayList<String> stringArr = new ArrayList<>();
			ArrayList<Integer> intArr = new ArrayList<>();
			ArrayList<Integer> stringIdx = new ArrayList<>(), intIdx = new ArrayList<>();
			for(int i = 0; i < s.length; i++) {
				try {
					intArr.add(Integer.parseInt(s[i]));
					intIdx.add(i);
				} catch(Exception e) {
					stringArr.add(s[i].toLowerCase());
					stringOrigin.put(s[i].toLowerCase(), s[i]);
					stringIdx.add(i);
				}
			}
			
			Collections.sort(intArr);
			Collections.sort(stringArr);
			
			String[] answer = new String[s.length];
			for(int i = 0; i < intIdx.size(); i++) {
				answer[intIdx.get(i)] = String.valueOf(intArr.get(i));
			}
			for(int i = 0; i < stringIdx.size(); i++) {
				answer[stringIdx.get(i)] = stringOrigin.get(stringArr.get(i));
			}
			
			StringJoiner sj = new StringJoiner(", ");
			for(String a : answer) {
				sj.add(a);
			}
			sb.append(sj).append(".").append("\n");
		}
		System.out.print(sb);
	}
}
