package lesson150402.exceptions;

public class DivisionByZero {
	
	//смысла передавать ошибку throw дальше нет смысла, т.к. это приведёт
	//просто к завершению данной программы
	public static void main(final String[] args) {
		int result;
		try {
			result = div(100, 0);
		} catch (DividerIsZero e) {
			result = Integer.MAX_VALUE;
//			e.printStackTrace();
		}
		System.out.println(result);
	}
	
	//thows говорит "передай проблему дальше по цепочке использования" и тот, кто дальше
	//решшает: передавать дальше или же решать через try/catch
	private static int div(final int i, final int j) throws DividerIsZero {
		if ( j == 0){
			throw new DividerIsZero();
		}
		
		return i / j;
	}
	
}
