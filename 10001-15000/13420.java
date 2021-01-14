import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int size = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < size; i++) {
			String[] str = br.readLine().split(" ");
			long num = Long.parseLong(str[0]);
			long num1 = Long.parseLong(str[2]);
			long result = Long.parseLong(str[4]);
			
			if(str[1].equals("+")) {
				if(num + num1 == result) {
					System.out.println("correct");
				}
				else {
					System.out.println("wrong answer");
				}
			}
			else if(str[1].equals("-")) {
				if(num - num1 == result) {
					System.out.println("correct");
				}
				else {
					System.out.println("wrong answer");
				}
			}
			else if(str[1].equals("*")) {
				if(num * num1 == result) {
					System.out.println("correct");
				}
				else {
					System.out.println("wrong answer");
				}
			}
			else if(str[1].equals("/")) {
				if(num / num1 == result) {
					System.out.println("correct");
				}
				else {
					System.out.println("wrong answer");
				}
			}
		}
	}
}
