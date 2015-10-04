public void print() {
		if(this.head==null) return;
		else{
			Node current = this.head;
			while(current!=null){
				System.out.print(current+"-> ");
				current = current.getNext();
			}
		}
		System.out.print("null");
		System.out.println();
}
