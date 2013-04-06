package dynamic;

public class BusinessLogicConcern implements BusinessLogic {

	@Override
	public void businessMethod1() {
		doCoreBusiness1();

	}

	private void doCoreBusiness1() {
		System.out.println("Doing CoreBusiness1");

	}

	@Override
	public void businessMethod2() {
		doCoreBusiness2();

	}

	private void doCoreBusiness2() {
		System.out.println("Doing CoreBusiness2");

	}

}
