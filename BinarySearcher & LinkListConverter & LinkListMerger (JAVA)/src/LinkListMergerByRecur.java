
public class LinkListMergerByRecur extends LinkListMerger {

	public LinkListMergerByRecur() {
	}

	@Override
	protected LinkList mergeInternal(LinkList list1, LinkList list2) {

		LinkList list;
		if (list1.getHead().getValue() <= list2.getHead().getValue()) {
			list = list1;
		} else {
			list = list2;
		}

		mergeByRecur(list1.getHead(), list2.getHead());

		return list;

	}

	private ListNode mergeByRecur(ListNode nodeA, ListNode nodeB) {

		if (nodeA == null && nodeB == null) {
			return null;
		} else if (nodeA == null) {
			return nodeB;
		} else if (nodeB == null) {
			return nodeA;
		}

		ListNode result = null;

		if (nodeA.getValue() <= nodeB.getValue()) {
			result = nodeA;
			result.setNextNode(mergeByRecur(nodeA.getNextNode(), nodeB));
		} else {
			result = nodeB;
			result.setNextNode(mergeByRecur(nodeB.getNextNode(), nodeA));
		}
		return result;

	}

}
