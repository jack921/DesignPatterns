package 工厂模式;

public class AudiCarFactory extends AudiFactory{

	@Override
	public <T extends AudiCar> T createAudiCar(Class<T> cls) {
		AudiCar car=null;
		try{
			car=(AudiCar)Class.forName(cls.getName()).newInstance();
		}catch(Exception e){
			e.printStackTrace();
		}
		return (T)car;
	}

}
