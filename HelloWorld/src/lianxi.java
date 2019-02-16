import java.sql.SQLNonTransientConnectionException;
import java.util.Scanner;
public class lianxi {
	public static int year;
	public static int mouth; 
	static int[] dayofmouth= {31,29,31,30,31,30,31,31,30,31,30,31};//ÿ���µ�����
   public static void main(String[] args) {
		inputnum();
		printcalendar();
		
}
//��ӡ����
   public static void printcalendar() {
	   int sum=getsumdaysofyear();
	   sum+=getsumdaysofmouth();
	   printmouthandweeks();
	   printcalendarweeks(sum%7);
	   
   }
   /*��ӡ������\t��\n���ж�
    * 
    */
   private static void printcalendarweeks(int dayofweek) {
	   int weekday=0;//\t������
	   if(dayofweek==0) {
		weekday=6;   
	   }else {
		weekday=dayofweek-1;
	}
	   for (int i = 0; i <weekday; i++) {
		System.out.print("\t");
	}
	   for (int i = 0; i < dayofmouth[mouth-1]; i++) {
		   System.out.print(i+1);
		   if ((dayofweek+i)%7==0) {
			   System.out.println();
		   }else {
			System.out.printf("\t");
		}
	}
   }
	

   //��ӡ�·ݺ�����
   private static void printmouthandweeks() {
	   System.out.println(year+"��\t"+mouth+"��");
		for (int i = 0; i < 7; i++) {
		 System.out.printf("����"+(i+1)+"\t");
	       }
		System.out.println();
	
}
   //����
   public static void inputnum() {
	Scanner input=new Scanner(System.in);
	System.out.println("���������:");
	year=input.nextInt();
	System.out.println("�������·�:");
	mouth=input.nextInt();
   }
   //�����ʱ�䵽1900��1��1�յ�������
   public static int getsumdaysofyear() {
	   if (year==Integer.MIN_VALUE) {
		System.out.println("������������ȷ���");
		inputnum();
	   }
		int sum=0;
	   for (int i = 0; i < year-1900; i++) {
		sum+=365;
		if(isture(i)) {
			sum++;
		}
	 }
	   return sum;
 }
   public static int getsumdaysofmouth() {
	   int sum=0;
	   for (int i = 0; i < mouth-1; i++) {
	   sum+=dayofmouth[i];   
	}
	   if(isture(year)&&mouth>=3) {
		   sum++;   
	   }
	   return sum;
 }

   private static boolean isture(int year) {
	   return year%400==0||year%4==0&&year%100!=0;
	
 }
}
//	System.out.println("---------------------------------------------");
//	for (int i = 0; i < 7; i++) {
//		 System.out.printf("����"+(i+1)+"\t");
//	       }
//	//1900��1��1��������һ
//	//����1997��6�·����� 6��Ϊ30��
//	int []a= {31,28,31,30,31,30,31,31,30,31,30,31};//�����·�
//	int []b= {31,29,31,30,31,30,31,31,30,31,30,31};//�������·�
//	int sum=0;
//	if (year%400==0) {
//		for (int i = 1; i <= mouth; i++) {
//		sum+=a[i-1];
//		}
//		int cha=(year-1900)*1459-364+sum;
//		
//
//	} else {
//		for (int i = 1; i <= mouth; i++) {
//		sum+=b[i-1];
//		}
//		int cha=(year-1900)*1459-364+sum;
//
//	}
//	System.out.println("SUM="+sum);
//   



