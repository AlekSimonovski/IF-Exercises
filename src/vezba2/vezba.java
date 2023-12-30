package vezba2;

import java.util.Scanner;

public class vezba {

	public static void main(String[] args) {
		boolean p, q;
		Scanner tastatura = new Scanner(System.in);
		p = tastatura.nextBoolean();
		q = tastatura.nextBoolean();
		if(p && q) {
			q=false;
		}else {
			if(!q) {
				System.out.println(p);
			}
			if(p==q) {
				System.out.println(p || q);
			}
			System.out.println(q);	//Prints code
	}
}
}
