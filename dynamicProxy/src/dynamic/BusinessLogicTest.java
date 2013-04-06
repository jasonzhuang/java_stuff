package dynamic;

public class BusinessLogicTest {
public static void main(String[] args) {
	BusinessLogic business=(BusinessLogic)LoggingProxyAspect.bind(new BusinessLogicConcern());
	business.businessMethod1();
	System.out.println("---------");
	business.businessMethod2();
}
}
