package ÊÊÅäÆ÷Ä£Ê½;

public class ObjectVoltAdapter implements ObjectFiveVolt{

	private ObjectVolt220 objectVolt220;
	
	public ObjectVoltAdapter(ObjectVolt220 objectVolt220){
		this.objectVolt220=objectVolt220;
	}
	
	public int getVolt220(){
		return objectVolt220.getVolt220();
	}
	
	public int getVolt5() {
		return 5;
	}

}
