import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.naming.spi.DirStateFactory.Result;
import javax.print.DocFlavor.INPUT_STREAM;
public class demoʮ���� {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String a=input.nextLine();//ʮ��������������
//		int num=input.nextInt()	;
//		System.out.println(shi(num));
		System.out.println(shiliu(a));
	}
	public static int shiliu(String a) {
		//���ؽ��
	    int b=0;//1A->1*16+10=26
		for(int i=0;i<a.length();i++) {
			char chartemp=a.charAt(i);
			if (chartemp>='1'&&chartemp<='9') {
				b+=(chartemp-'0')*Math.pow(16, a.length()-i-1);
			} else if (chartemp>='a'&&chartemp<='f') {
				b+=(chartemp+10-'a')*Math.pow(16, a.length()-i-1);
			} //��a.length()-i-1������ǵڼ�λ
}
		
		return b;
		
	}
//			System.out.println("���ǵ�"+i+"��ѭ��");
//			System.out.println("chartemp+10-'a':"+(chartemp+10-'a'));
//			System.out.println("a:"+('a'-0));
//			System.out.println("chartemp:"+chartemp);
//			System.out.println("a.length():"+a.length());
//			System.out.println("Math.pow(16, a.length()-i-1)"+(Math.pow(16, a.length()-i-1)));
//			System.out.println("chartemp-'0':"+(chartemp-'0'));
//			System.out.println("b��ֵ��"+b);

//	public static String shi(int num) {
//		String result="";
//		while (num!=0) {
//			int a=num%16;
//			if (a>=0&&a<=9) {
//				result=a+result;
//		      }
//			else if(a>=10&a<=15) {
//			result=(char)(num-10+'A')+result;
//			}
//			num/=16;
//		}
//		return result;
//		
//	}

}
