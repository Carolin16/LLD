public class DLL
{
	Node head;
	Node tail;
	DLL()
	{
		head = new Node<>();
		tail = new Node<>();
		head.next = tail;
		tail.prev = head;
	}
	class Node
	{
		String data;
		Node prev;
		Node next;
		Node(String data)
		{
			this.data = data;
			next = null;
			prev = null;
		}
	}
	void moveHead()
	{
		head = head.next;
	}
	Node getFirstNode()
	{
		if(!isEmpty())
		{
			return null;
		}
		return head.next;
	}
	void detachNode(Node curr)
	{
		Node prev = curr.prev;
		Node nextNode = curr.next;
		prev.next = nextNode;
		nextNode.prev = prev;
	}
	void attachNodeAtEnd(Node curr)
	{
		Node tailPrev = tail.prev;
		tailPrev.next = curr;
		curr.prev = tailPrev;
		curr.next = tail;
		tail.prev = curr;
	}
	int getFirstElement()
	{
		return head.data;
	}
	boolean isEmpty()
	{
		return head!=tail;
	}
}