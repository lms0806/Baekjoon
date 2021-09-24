public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		int num = 1000;
		while(num < 10000) {
			if(calc(num, 10) == calc(num, 12) && calc(num, 12) == calc(num, 16)) {
				sb.append(num).append("\n");
			}
			num++;
		}
		System.out.print(sb);
	}
	
	public static int calc(int n, int div) {
		int result = 0;
		while(n != 0) {
			result += n % div;
			n /= div;
		}
		return result;
	}
}
