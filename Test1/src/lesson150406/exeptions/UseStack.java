package lesson150406.exeptions;

public class UseStack {

	public static void main(final String[] args) {

		Stack stack = new Stack(3);
		
		try {
			stack.pop();
		} catch (StackEmptyException e1) {
			System.out.println(e1);
		}
		
		
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
			try{
				System.out.println(stack.pop());	//ВСЁ, что может вывести исключительную ситуацию, обязано обрабатываться в try/catch
			}catch (StackEmptyException e){
				System.out.println(e);
			}
		}

	}

}
