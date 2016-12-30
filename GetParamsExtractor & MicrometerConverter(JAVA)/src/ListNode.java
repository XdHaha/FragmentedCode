
public class ListNode {
	
	private String mKey = null;
	private String mValue = null;
	private ListNode mNextNode = null;
	private ListNode mPreNode = null;

	public ListNode() {
	}

	public ListNode(String key, String value, ListNode next) {
		mKey = key;
		mValue = value;
		mNextNode = next;
	}

	public String getKey() {
		return mKey;
	}

	public String getValue() {
		return mValue;
	}

	public ListNode getPreNode() {
		return mPreNode;
	}

	public ListNode getNextNode() {
		return mNextNode;
	}

	public void setKey(String key) {
		mKey = key;
	}

	public void setValue(String value) {
		mValue = value;
	}

	public void setPreNode(ListNode node) {
		mPreNode = node;
	}

	public void setNextNode(ListNode node) {
		mNextNode = node;
	}

}
