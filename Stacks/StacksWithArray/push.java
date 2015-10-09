public void push(Object dataIn) {
		if (this.size == this.capacity) {
			System.out.println("Stack full!");
			return;
		}
		this.data[size++] = dataIn;
		this.top = this.data[size];
}
