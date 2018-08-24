package operacion;
import java.math.BigDecimal;
import java.util.Random;

public class Operacion implements IOperacion{

	public static void main(String[] args) {
		BigDecimal n1 = BigDecimal.valueOf(15.7);
		BigDecimal n2 = BigDecimal.valueOf(22.4);
		System.out.println(n1.add(n2));
		System.out.println(n1.subtract(n2));
		System.out.println(n1.divide(n2));
		System.out.println(n1.multiply(n2));
		
	}

	@Override
	public BigDecimal add(BigDecimal n1, BigDecimal n2) {
		return n1.add(n2);
	}

	@Override
	public BigDecimal substract(BigDecimal n1, BigDecimal n2) {
		return n1.subtract(n2);
	}

	@Override
	public BigDecimal divide(BigDecimal n1, BigDecimal n2) {

		return n1.divide(n2);
	}

	@Override
	public BigDecimal multiply(BigDecimal n1, BigDecimal n2) {
		return n1.multiply(n2);
	}

}
