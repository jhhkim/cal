package ����;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//ȿ���� �ڵ� while�� ����
		boolean test = true;
		while(test){
			System.out.println("���ϴ� ������ ��ȣ�� �Է��Ͻʽÿ�.\n1.���� 2.���� 3.���� 4.������");
			int ch = scan.nextInt();
			
			System.out.println("ù��° ���ڸ� �Է��Ͻʽÿ�.");
			int n1 = scan.nextInt();
			
			System.out.println("�ι�° ���ڸ� �Է��Ͻʽÿ�.");
			int n2 = scan.nextInt();
			
			if(ch==4&&n2==0) {
				System.out.println("0���� ���� �� �����ϴ�. 0�� �ƴ� ���ڸ� �Է��Ͻʽÿ�.");
				/*ch==4&&n2==0�϶�, n2�� �ٽ� �Է��ϰ� �Ϸ��� ���?*/
			}else if (ch==1) {
				Cal cp = new Cal();
				int res = cp.plus(n1, n2);
				System.out.println("���� ����� "+res+"�Դϴ�.");	
			} else if (ch==2) {
				Cal cm = new Cal();
				int res = cm.minus(n1, n2);
				System.out.println("���� ����� "+res+"�Դϴ�.");
			} else if (ch==3) {
				Cal cmul = new Cal();
				int res = cmul.mul(n1, n2);
				System.out.println("���� ����� "+res+"�Դϴ�.");
			} else {
				Cal cd = new Cal();
				int res = cd.div(n1, n2);
				System.out.println("������ ����� "+res+"�Դϴ�.");	
			}/*���ϴ� ������ ��ȣ�� ���� 1~3���� ��ȣ�� �Է��ϸ� ��� ������ ������ �����ϰ� ��
			1~4�� �ƴ� ���ڸ� �Է��ϸ� "�ùٸ� ��ȣ�� ���ʽÿ�."��� ��� �� �ٽ� �����ȣ �� �� �ְ� �Ϸ��� ���?*/
			
			System.out.println("�ٽ� ����Ͻðڽ��ϱ�?\n1.�� 2.�ƴϿ�");
				int re = scan.nextInt();
				if (re==2) {
					test = false;
				}
		}
				

	}

	

}
