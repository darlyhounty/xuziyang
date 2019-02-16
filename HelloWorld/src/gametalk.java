import java.util.concurrent.TimeUnit;
//实现游戏npc随机喊话功能

public class gametalk {
	public static void main(String[] args) {
//		talk("大哥","世界频道", "收元宝",3, 1);
		talk("徐大侠", ":");
}
	//重载的喊话方法
	public static void talk(String name,String channl) {
		for (int i = 0; i < 5; i++) {
			String []	com= {
					"今天天气怎么样?",
					"今天吃的什么?",
					"今天你去哪里了?"
			};
			String num=com[(int) (Math.random()*3)];//npc随机喊话
			talk(name, channl,num,1,1);
			System.out.println(Math.random());
		}

	}

    public static void talk(String name,String channl,String message,int times,int interval) {
		String value=String.format("[%s]%s%s", name,channl,message);//interval 喊话间隔时间
	      for (int i = 0; i < times; i++) {
		         System.out.println(value);
					try {
						Thread.sleep(interval*1000);//休眠时间 默认1000毫秒
//					TimeUnit.SECONDS.sleep(interval);
//					TimeUnit.HOURS.sleep(interval);
					}
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
		}
}


