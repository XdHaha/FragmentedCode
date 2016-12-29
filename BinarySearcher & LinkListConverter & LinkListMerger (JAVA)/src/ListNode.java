
public class ListNode {
	private int mValue = 0;
	private ListNode mNextNode = null;
	
	public ListNode() {
	}

	public ListNode(int value, ListNode next) {
		mValue = value;
		mNextNode = next;
	}

	public int getValue() {
		return mValue;
	}
	
	public ListNode getNextNode() {
		return mNextNode;
	}
	
	public void setValue(int value) {
		mValue = value;
	}
	
	public void setNextNode(ListNode node) {
		mNextNode = node;
	}	

}
