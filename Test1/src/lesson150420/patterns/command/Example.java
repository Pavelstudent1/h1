package lesson150420.patterns.command;

public class Example {
	
	abstract static class Command {
		
		Calculator _service;
		
		public Command(final Calculator service) {
			_service = service;
		}
		
		public abstract void execute();
	}
	
	static class Do2Command extends Command {

		public Do2Command(final Calculator service) {
			super(service);
		}

		@Override
		public void execute() {
//			_service.do2();
		}
		
		
		
	}
	
	public static void main(final String[] args) {
		
		System.out.println("start");
		
		Calculator service = new Calculator();
		
//		service.doSomthing(); //синхронный вызов, т.к. в момент вызова, управление
							  //передаётся в doSomething и ждём, пока там что-либо
							  //делается. Кроме того, вызов этого метода - жёсткая связка
//		service.do2();
//		service.do3();
		
		Command command = new Do2Command(service);
		
		
		
		
		
		System.out.println("finish");

	}
	
	
}
