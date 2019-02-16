import java.util.Arrays;

public class demo {
	public static void main(String[] args) {
		double [][] arr1 = 
			{
				{9.848212086614176 ,0.0,0.0 ,0.0},
				{ -2.100078808180536,   32.00520103667137 ,0.0  , 0.0},
				{ 3.796300430958405 , 9.20718684777012   ,  -13.09820418272973  ,   0.0},
				{ 9.340582000000001 , -18.682062000000005,  -1.6618889999999944  ,  12.795504000000003}
			};
		double [][] arr2 = 
			{
					{113.07644780594023,0,0,0},
					{-6.7706714650574895,0,0,0},
					{-43.60465567489672,0,0,0},
					{95.71036992000003,0,0,0}
			};
		//定义并填充存放结果的数组
		double [][] arrResult = new double[4][4];
		for(int i = 0; i < 2; i++){
			Arrays.fill(arrResult[i], 0);
		}
		//输出矩阵乘法前的结果数组
		for(int i = 0; i < 2; i++){
			System.out.println(Arrays.toString(arrResult[i]));
		}
		//计算矩阵乘法
		for(int i = 0; i < arr1.length; i++){
			//外循环，arr1的第i行
			for(int j = 0; j < arr1.length; j++){
				//内循环，arr2的第j列，这里也用arr1.length，是因为arr1的行数和arr2的列数是一致的
				//arrResult[i][j]即为结果
				for(int k = 0; k < arr2.length; k++){
					//内内循环，k值用来控制相乘的元素的索引
					//表现为，k控制arr1横向移动，arr2纵向移动
					//即arr1[i][k]，arr2[k][j]
					arrResult[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		//输出矩阵乘法后的结果数组
		for(int i = 0; i < arrResult.length; i++){
			System.out.println(Arrays.toString(arrResult[i]));
		}
	}			
}