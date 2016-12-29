
public abstract class LinkListMerger {

	public LinkListMerger() {
	}

	public LinkList merge(LinkList list1, LinkList list2) {
		return mergeInternal(list1, list2);
	}
	
	protected abstract LinkList mergeInternal(LinkList list1, LinkList list2);
}
