import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] word = {"ㄱㄲㄴㄷㄸㄹㅁㅂㅃㅅㅆㅇㅈㅉㅊㅋㅌㅍㅎ", "ㅏㅐㅑㅒㅓㅔㅕㅖㅗㅘㅙㅚㅛㅜㅝㅞㅟㅠㅡㅢㅣ", " ㄱㄲㄳㄴㄵㄶㄷㄹㄺㄻㄼㄽㄾㄿㅀㅁㅂㅄㅅㅆㅇㅈㅊㅋㅌㅍㅎ"};
		
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) {
			String s = br.readLine();
			
			if(s.equals("")) {
				continue;
			}
			
			char c = s.charAt(0);
			
			for(int j  = 0; j < word[i].length(); j++) {
				if(word[i].charAt(j) == c) {
					arr[i] = j;
					break;
				}
			}
		}
		
		System.out.print((char)(((arr[0] * 21) + arr[1]) * 28 + (arr[2]) + 0xAC00));
	}
}
