import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		
		ArrayList<Character> s = new ArrayList<>(), r = new ArrayList<>(), p = new ArrayList<>();
		for(char c  : br.readLine().toCharArray()) {
			if(c == 's') {
				if(s.size() == k) {
					if(r.size() == k) {
						p.add(c);
					}
					else {
						r.add(c);
					}
				}
				else {
					s.add(c);
				}
			}
			else if(c == 'r') {
				if(r.size() == k) {
					if(p.size() == k) {
						s.add(c);
					}
					else {
						p.add(c);
					}
				}
				else {
					r.add(c);
				}
			}
			else {
				if(p.size() == k) {
					if(s.size() == k) {
						r.add(c);
					}
					else {
						s.add(c);
					}
				}
				else {
					p.add(c);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(print(s)).append("\n").append(print(r)).append("\n").append(print(p));
		System.out.print(sb);
	}
	
	public static StringBuilder print(ArrayList<Character> arr) {
		StringBuilder sb = new StringBuilder();
		for(char c : arr) {
			sb.append(c);
		}
		return sb;
	}
}
