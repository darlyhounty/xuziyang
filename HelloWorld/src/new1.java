   public class new1{
	
	public static void name(String[] args) {
		talk("���","����Ƶ��",3, "��Ԫ��", 1);
	}
	
	

	public static void main(String[] args) {
		
	}
	public static void talk(String name,String channl,int times,String message,int interval) {
		String value=String.format("[%s]%s%s", name,channl,message);
		for (int i = 0; i < times; i++) {
			System.out.println(value);
			try {
				Thread.sleep(interval*1000);
			}
			catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		}
}
