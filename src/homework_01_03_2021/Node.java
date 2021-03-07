package homework_01_03_2021;

public class Node <T>{
	private T data;
	private Node <T> next;
	
	public Node(T dataValue, Node <T> nextValue) 
	{
		this.setData(dataValue);
		this.setNext(nextValue);
	}
	
	public Node(T dataValue)
	{
		this.setData(dataValue);
		this.next = null;
	}
	public void setData(T data)
	{
		if(data != null)
		{
			this.data = data;
		}
	}
	public void setNext(Node<T> next)
	{
		if(next != null)
		{
			this.next = next;
		}
	}
	
	public T getData() 
	{
		return data;
	}
	public Node <T> getNext()
	{
		return next;
	}
	public boolean isEnd() 
	{
		return this.next == null;
	}
	public String toString()
	{
		String result = data.toString();
		return result;
	}


}
