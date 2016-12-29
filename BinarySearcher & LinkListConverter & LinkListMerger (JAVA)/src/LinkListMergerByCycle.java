
public class LinkListMergerByCycle extends LinkListMerger {

	public LinkListMergerByCycle() {
	}

	@Override
	protected LinkList mergeInternal(LinkList list1, LinkList list2) {

		LinkList list;
		ListNode node, nodeA, nodeB;

		if (list1.getHead().getValue() <= list2.getHead().getValue()) {
			list = list1;
			node = list1.getHead();
			nodeA = list1.getHead().getNextNode();
			nodeB = list2.getHead();
		} else {
			list = list2;
			node = list2.getHead();
			nodeB = list2.getHead().getNextNode();
			nodeA = list1.getHead();
		}

		while (nodeA != null && nodeB != null) {
			if (nodeA.getValue() < nodeB.getValue()) {
				node.setNextNode(nodeA);
				node = nodeA;
				nodeA = nodeA.getNextNode();
			} else {
				node.setNextNode(nodeB);
				node = nodeB;
				nodeB = nodeB.getNextNode();
			}
		}

		node.setNextNode((nodeA == null) ? nodeB : nodeA);

		return list;
	}

}
