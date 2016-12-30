import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class GetParamsExtractor implements IExtractor {

	public GetParamsExtractor() {
	}

	@Override
	public LinkList extract(String url) {
		return extractGetParamsFormURL(url);
	}

	private LinkList extractGetParamsFormURL(String url) {

		try {

			LinkList list = new LinkList();

			ListNode mCurrentNode = null;

			String[] urlParts = url.split("\\?");

			if (urlParts.length > 1) {

				String query = urlParts[1];

				for (String param : query.split("&")) {

					String[] pair = param.split("=");

					String key = URLDecoder.decode(pair[0], "UTF-8");

					String value = "";

					if (pair.length > 1) {
						value = "'" + URLDecoder.decode(pair[1], "UTF-8") + "'";
					} else {
						value = Constants.UNDEFINED;
					}

					ListNode node = new ListNode();
					node.setKey(key);
					node.setValue(value);
					
					if (mCurrentNode != null) {
						mCurrentNode.setNextNode(node);
						node.setPreNode(mCurrentNode);
					}
					mCurrentNode = node;
					
				}
			}

			list.setTail(mCurrentNode);
			return list;

		} catch (UnsupportedEncodingException ex) {
			throw new AssertionError(ex);
		}
	}

}
