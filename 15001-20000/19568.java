public class Main {
	public static void main(String[] args) {
		int[][] arr = new int[30][30];
		
		for(int i = 0; i < 15; i++) {
			arr[15][14 - i] = 1;
			arr[14 - i][15] = 16;
			arr[15][15 + i] = 16 * 16;
			arr[15 + i][15] = 16 * 16 * 15;
		}
		arr[15][15] = 0;
		
		StringBuilder sb = new StringBuilder();
		for(int[] ar : arr) {
			for(int a : ar) {
				sb.append(a).append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
