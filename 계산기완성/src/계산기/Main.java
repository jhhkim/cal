package 계산기;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//효진님 코드 while문 참조
		boolean test = true;
		while(test){
			System.out.println("원하는 연산의 번호를 입력하십시오.\n1.덧셈 2.뺄셈 3.곱셈 4.나눗셈");
			int ch = scan.nextInt();
			
			System.out.println("첫번째 숫자를 입력하십시오.");
			int n1 = scan.nextInt();
			
			System.out.println("두번째 숫자를 입력하십시오.");
			int n2 = scan.nextInt();
			
			if(ch==4&&n2==0) {
				System.out.println("0으로 나눌 수 없습니다. 0이 아닌 숫자를 입력하십시오.");
				/*ch==4&&n2==0일때, n2만 다시 입력하게 하려면 어떻게?*/
			}else if (ch==1) {
				Cal cp = new Cal();
				int res = cp.plus(n1, n2);
				System.out.println("덧셈 결과는 "+res+"입니다.");	
			} else if (ch==2) {
				Cal cm = new Cal();
				int res = cm.minus(n1, n2);
				System.out.println("뺄셈 결과는 "+res+"입니다.");
			} else if (ch==3) {
				Cal cmul = new Cal();
				int res = cmul.mul(n1, n2);
				System.out.println("곱셈 결과는 "+res+"입니다.");
			} else {
				Cal cd = new Cal();
				int res = cd.div(n1, n2);
				System.out.println("나눗셈 결과는 "+res+"입니다.");	
			}/*원하는 연산의 번호를 고를때 1~3외의 번호를 입력하면 모두 나눗셈 연산을 시행하게 됨
			1~4가 아닌 숫자를 입력하면 "올바른 번호를 고르십시오."라고 띄운 뒤 다시 연산번호 고를 수 있게 하려면 어떻게?*/
			
			System.out.println("다시 계산하시겠습니까?\n1.네 2.아니오");
				int re = scan.nextInt();
				if (re==2) {
					test = false;
				}
		}
				

	}

	

}
