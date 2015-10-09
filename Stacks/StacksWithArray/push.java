public void push(Object dataIn) {
	if (this.isFull()) {
		System.out.println("Stack full!");
		return;
	}
	this.data[++top] = dataIn;
}
