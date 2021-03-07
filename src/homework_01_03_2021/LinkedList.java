package homework_01_03_2021;

public class LinkedList<T> implements List<T> {

	private Node<T> top;
	private int index;

	public LinkedList() {
		top = null;
		index = 1;
	}

	@Override
	public boolean isEmpty() {
		return this.top == null;
	}

	@Override
	public boolean contains(T item) {
		Node<T> temp = this.top;

		while (temp != null) {
			if (temp.getData() == item) {
				return true;
			}
			temp = temp.getNext();

		}
		return false;
	}

	@Override
	public void add(T item) {

		if (top == null) {
			top = new Node<>(item);
		} 
		else 
		{
			Node<T> temp = top;

			while (temp.getNext() != null) {
				temp = temp.getNext();
			}

			Node<T> newnode = new Node<T>(item);
			temp.setNext(newnode);

			index++;
		}
	}

	@Override
	public void insertAt(T item, int index) {
		if(index < 0 && index >this.index) 
		{
			throw new ArrayIndexOutOfBoundsException("Index cannot be smaller than 0 or bigger than the private index");
		}
		Node <T> temp = top;

		if (index == 0) 
		{
			Node<T> newTop = new Node<T>(item);
			
			newTop.setNext(temp);
			
			top = newTop;
			this.index++;
			
			
		} else {
			for (int i = 1; i < index; i++) {
				if (temp.getNext() != null)
					temp = temp.getNext();
			}

			Node<T> newTop = new Node<T>(item);
			newTop.setNext(temp.getNext());
			temp.setNext(newTop);
			this.index++;
		}
	}
	

	@Override
	public void removeFrom(int index) {

	}

	@Override
	public void remove(T item) {
	
		
	}

	

	@Override
	public T get(int index) {
		if(index < 0 && index >this.index) 
		{
			throw new ArrayIndexOutOfBoundsException("Index cannot be smaller than 0 or bigger than the private index");
		}
		Node <T> temp = top;
		int tempIndex=1;
		while(tempIndex < index) 
		{
			if(temp.getNext() != null) 
			{
				temp=temp.getNext();
			}
			tempIndex++;
		}
		return temp.getData();
	}

	@Override
	public void clear() {
		this.top = null;

	}

}
