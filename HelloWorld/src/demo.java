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
		//���岢����Ž��������
		double [][] arrResult = new double[4][4];
		for(int i = 0; i < 2; i++){
			Arrays.fill(arrResult[i], 0);
		}
		//�������˷�ǰ�Ľ������
		for(int i = 0; i < 2; i++){
			System.out.println(Arrays.toString(arrResult[i]));
		}
		//�������˷�
		for(int i = 0; i < arr1.length; i++){
			//��ѭ����arr1�ĵ�i��
			for(int j = 0; j < arr1.length; j++){
				//��ѭ����arr2�ĵ�j�У�����Ҳ��arr1.length������Ϊarr1��������arr2��������һ�µ�
				//arrResult[i][j]��Ϊ���
				for(int k = 0; k < arr2.length; k++){
					//����ѭ����kֵ����������˵�Ԫ�ص�����
					//����Ϊ��k����arr1�����ƶ���arr2�����ƶ�
					//��arr1[i][k]��arr2[k][j]
					arrResult[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		//�������˷���Ľ������
		for(int i = 0; i < arrResult.length; i++){
			System.out.println(Arrays.toString(arrResult[i]));
		}
	}			
}