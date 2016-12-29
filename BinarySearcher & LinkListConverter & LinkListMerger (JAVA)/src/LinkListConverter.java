
public class LinkListConverter implements IConverter {

	private static IConverter sInstace;
	
	private LinkListConverter() {
	}

	public static IConverter getInstace() {
		if (sInstace == null) {
			sInstace = new LinkListConverter();
		}
		return sInstace;
	}

	@Override
	public LinkList convertFrom(int[] array) {
		return convert(array);
	}

	private LinkList convert(int[] array) {

		int length = array.length;

		if (length < 1) {
			return null;
		}

		LinkList list = new LinkList();

		ListNode headNode = new ListNode();
		headNode.setValue(array[0]);

		ListNode mCurrentNode = headNode;
		for (int i = 1; i < length; i++) {
			ListNode node = new ListNode();
			node.setValue(array[i]);
			mCurrentNode.setNextNode(node);
			mCurrentNode = node;
		}

		ListNode tailNode = mCurrentNode;

		list.setHead(headNode);
		list.setTail(tailNode);

		return list;
	}

}
