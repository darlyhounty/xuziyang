import java.sql.Time;

import javax.swing.plaf.basic.BasicBorders;

import org.omg.CORBA.PRIVATE_MEMBER;

public class test1 {
	private String nickname;
	private int level;
	private int maxLife;
	private int currLife;
	public test1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public test1(String nickname, int level, int maxLife, int currLife) {
		super();
		this.nickname = nickname;
		this.level = level;
		this.maxLife = maxLife;
		this.currLife = currLife;
	}
	public void move() {
		System.out.println("移动方法");
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurrLife() {
		return currLife;
	}
	public void setCurrLife(int currLife) {
		this.currLife = currLife;
	}

	
	
//	String hername="darly";
//	hername="hounty";
//	hername=hername.concat("cool");
//	String  hisname=" darly ";
//	hisname=hisname.toUpperCase();
//
//	System.out.println(hername);
//	System.out.println(hisname);
//	System.out.println(hername.equals(hisname));
//	long starttime=System.currentTimeMillis();
//	int n=100000;
//	String str="a";
//	StringBuilder str1=new StringBuilder();
//	for (int i = 0; i < n; i++) {
//		str1.append("*");
//	}
//	long endtime=System.currentTimeMillis();
//	System.out.println("用时"+(endtime-starttime)+"毫秒");

}
