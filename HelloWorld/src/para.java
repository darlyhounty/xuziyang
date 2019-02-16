import java.lang.reflect.Parameter;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class para {
public static void main(String[] args) {
//	paratext("参数测试",1,2,3,4,5,6);
	System.out.println(max(3,5));
}
static double max(int num1,double num2) {

	return num1>num2?num1:num2;
	

//public static void paratext(String str,int...num) {
//	System.out.println("第一个参数"+str);
//	System.out.println("参数数组的长度"+num.length);
//	for (int i = 0; i < num.length; i++) {
//		System.out.println(num[i]);
//	}
}

}
