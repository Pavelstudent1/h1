package lesson150330.inner_example;

public class Dog {
	
	private interface BrainState {
		void stroke();
		void feed();
	}
	
		private class Evil implements BrainState{

		@Override
		public void stroke() {
			Dog.this.bite();
		}

		@Override
		public void feed() {
			Dog.this.state = new Good();
			bark();
		}
		
	}
	
	class Good implements BrainState{
		int count;
		
		@Override
		public void stroke() {
			wag();
			++count;
			if (count > 3){
				state = new Evil();
			}
		}

		@Override
		public void feed() {
			wag(); wag();
			count = 0;
		}
		
	}
	
	BrainState state;

	public Dog() {
		state = new Evil();
	}
	
	


	public void stroke(){
		state.stroke();
	}
	
	public void feed() {
		state.feed();
	}
	
	private void bark() {
		System.out.println("bark");
	}
	
	private void wag(){
		System.out.println("wag");
	}
	
	private void bite() {
		System.out.println("bite");
	}
	
}
