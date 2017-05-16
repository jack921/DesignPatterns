package 工厂模式;

public abstract class AudiFactory {
	public abstract <T extends AudiCar> T createAudiCar(Class<T> cls);
}
