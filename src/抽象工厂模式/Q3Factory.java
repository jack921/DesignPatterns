package 抽象工厂模式;

public class Q3Factory extends CarFactory{

	@Override
	public ITire createITire() {
		return new NormalTire();
	}

	@Override
	public IKrake crrateIKrake() {
		return new NormalBrake();
	}

	@Override
	public IEngine createEndgine() {
		return new DomesticEngine();
	}

}
