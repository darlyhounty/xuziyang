import java.sql.SQLNonTransientConnectionException;
import java.util.Scanner;
public class lianxi {
	public static int year;
	public static int mouth; 
	static int[] dayofmouth= {31,29,31,30,31,30,31,31,30,31,30,31};//每个月的天数
   public static void main(String[] args) {
		inputnum();
		printcalendar();
		
}
//打印日历
   public static void printcalendar() {
	   int sum=getsumdaysofyear();
	   sum+=getsumdaysofmouth();
	   printmouthandweeks();
	   printcalendarweeks(sum%7);
	   
   }
   /*打印日期中\t和\n的判断
    * 
    */
   private static void printcalendarweeks(int dayofweek) {
	   int weekday=0;//\t的数量
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
	

   //打印月份和星期
   private static void printmouthandweeks() {
	   System.out.println(year+"年\t"+mouth+"月");
		for (int i = 0; i < 7; i++) {
		 System.out.printf("星期"+(i+1)+"\t");
	       }
		System.out.println();
	
}
   //输入
   public static void inputnum() {
	Scanner input=new Scanner(System.in);
	System.out.println("请输入年份:");
	year=input.nextInt();
	System.out.println("请输入月份:");
	mouth=input.nextInt();
   }
   //输入的时间到1900年1月1日的总天数
   public static int getsumdaysofyear() {
	   if (year==Integer.MIN_VALUE) {
		System.out.println("请重新输入正确年份");
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
//		 System.out.printf("星期"+(i+1)+"\t");
//	       }
//	//1900年1月1日是星期一
//	//输入1997年6月非闰年 6月为30天
//	int []a= {31,28,31,30,31,30,31,31,30,31,30,31};//闰年月份
//	int []b= {31,29,31,30,31,30,31,31,30,31,30,31};//非闰年月份
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



