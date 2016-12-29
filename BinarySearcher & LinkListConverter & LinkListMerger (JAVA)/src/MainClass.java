
public class MainClass {

	public static void main(String[] args) {

		int array1[] = { 1, 3, 4, 5, 7, 9 };
		int array2[] = { 2, 3, 4, 5, 6, 8 };

		// int array1[] = { 1, 3, 4, 5, 7, 9, 11, 13};
		// int array2[] = { 2, 3, 4, 5, 6, 8, 24};

		ISearcher searcher = BinarySearcher.getInstace();
		System.out.println("Searching 3 from array1. Position : ");
		System.out.println(searcher.search(array1, 3));

		System.out.println("Searching 13 from array2. Position : ");
		System.out.println(searcher.search(array2, 13));

		IConverter converter = LinkListConverter.getInstace();

		LinkList list1 = converter.convertFrom(array1);
		System.out.println("Converting array1 to list1 : ");
		printList(list1);
		System.out.println();

		LinkList list2 = converter.convertFrom(array2);
		System.out.println("Converting array2 to list2 : ");
		printList(list2);
		System.out.println();

		System.out.println("Merging list1 and list2 by recur : ");
		LinkList mergeLinkList1 = new LinkListMergerByRecur().merge(list1, list2);
		printList(mergeLinkList1);
		System.out.println();

		LinkList list3 = converter.convertFrom(array1);
		LinkList list4 = converter.convertFrom(array2);
		System.out.println("Merging list3 and list4 by cycle : ");
		LinkList mergeLinkList2 = new LinkListMergerByCycle().merge(list3, list4);
		printList(mergeLinkList2);
		System.out.println();

	}

	private static void printList(LinkList list) {
		if (list == null) {
			return;
		}
		ListNode node = list.getHead();
		while (node != null) {
			System.out.print(node.getValue() + " ");
			node = node.getNextNode();
		}
	}

}
