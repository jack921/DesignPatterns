package Builder模式;


public abstract class Builder {
	//设置主机
	public abstract void buildBoard(String board);
	//设置显示器
	public abstract void buildDisplay(String display);
	//设置操作系统
	public abstract void buidlOS();
	//创建电脑
	public abstract Computer create();
}
