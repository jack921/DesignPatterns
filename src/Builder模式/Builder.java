package Builderģʽ;


public abstract class Builder {
	//��������
	public abstract void buildBoard(String board);
	//������ʾ��
	public abstract void buildDisplay(String display);
	//���ò���ϵͳ
	public abstract void buidlOS();
	//��������
	public abstract Computer create();
}
