import java.util.concurrent.TimeUnit;
//ʵ����Ϸnpc�����������

public class gametalk {
	public static void main(String[] args) {
//		talk("���","����Ƶ��", "��Ԫ��",3, 1);
		talk("�����", ":");
}
	//���صĺ�������
	public static void talk(String name,String channl) {
		for (int i = 0; i < 5; i++) {
			String []	com= {
					"����������ô��?",
					"����Ե�ʲô?",
					"������ȥ������?"
			};
			String num=com[(int) (Math.random()*3)];//npc�������
			talk(name, channl,num,1,1);
			System.out.println(Math.random());
		}

	}

    public static void talk(String name,String channl,String message,int times,int interval) {
		String value=String.format("[%s]%s%s", name,channl,message);//interval �������ʱ��
	      for (int i = 0; i < times; i++) {
		         System.out.println(value);
					try {
						Thread.sleep(interval*1000);//����ʱ�� Ĭ��1000����
//					TimeUnit.SECONDS.sleep(interval);
//					TimeUnit.HOURS.sleep(interval);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		}
}


