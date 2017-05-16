package ���󹤳�ģʽ;

public class Q7Factory extends CarFactory{

	@Override
	public ITire createITire() {
		return new SUVTire();
	}

	@Override
	public IKrake crrateIKrake() {
		return new SeniorBrake();
	}

	@Override
	public IEngine createEndgine() {
		return new ImportEngine();
	}

}
