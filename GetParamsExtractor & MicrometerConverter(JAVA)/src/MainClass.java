public class MainClass {

	public static void main(String[] args) {

		LinkList getArgs = new GetParamsExtractor().extract(Constants.URL);
		System.out.println("The GET Args of the url : " + Constants.URL + " is : ");
		printLinkList(getArgs);

		System.out.println();
		System.out.println();
		System.out.println("The number of " + Constants.MicrometerNumber + " converted to micrometer number is : ");
		System.out.println(new MicrometerConverter().convert(Constants.MicrometerNumber));
	}

	private static void printLinkList(LinkList list) {
		if (list == null) {
			return;
		}
		ListNode node = list.getTail();
		while (node != null) {
			System.out.println(node.getKey() + " : " + node.getValue());
			node = node.getPreNode();
		}
	}

}
