public void push(Object dataIn) {
	if (this.top == this.capacity) {
		System.out.println("Stack full!");
		return;
	}
	this.data[++top] = dataIn;
}
