package Patterns;

public class OneLoopUsePattern {

	public static void main(String[] args) {

		int n = 7;
		int line_no = 1;

		int star = 0;
		for (line_no = 1; line_no <= n;) {
			// If current star count is less than
			// current line number
			if (star < line_no) {
				System.out.print("* ");
				star++;
				continue;
			}

			// Else time to print a new line
			if (star == line_no) {
				System.out.println("");
				line_no++;
				star = 0;
			}
		}
	}
}
