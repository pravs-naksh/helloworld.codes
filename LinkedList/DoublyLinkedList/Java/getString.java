public Node get(String dataIn) {
		// TODO Auto-generated method stub
		if(this.head == null) return null;
		else{
			Node current = this.head;
			while(current != null){
				if(dataIn == current.getData().toString()) 
					return current;
				current = current.getNext();
			}
			return null;
		}
}
