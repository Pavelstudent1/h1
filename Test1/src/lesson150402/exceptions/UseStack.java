package lesson150402.exceptions;

public class UseStack {

	public static void main(final String[] args) {

		Stack stack = new Stack(3);

		try {	//проверяем...
			stack.push("One");
			stack.push("Two");
			stack.push("Three");
			stack.push("Four");
		} catch (Exception e) {		//и перехватываем возможную ошибку,
									// оставляя отработавший код
//			System.out.println(e.getMessage()); //getMessage забираем у исключительной
												//ситуации её описание
			System.out.println(e);
		}										

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
