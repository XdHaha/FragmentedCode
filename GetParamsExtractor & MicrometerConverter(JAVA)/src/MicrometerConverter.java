import java.text.DecimalFormat;

public class MicrometerConverter implements IConverter {

	public MicrometerConverter() {
	}

	@Override
	public String convert(String from) {
		return convertToMicrometer(from);
	}

	private String convertToMicrometer(String from) {
		DecimalFormat df = null;
		if (from.indexOf(".") > 0) {
			if (from.length() - from.indexOf(".") - 1 == 0) {
				df = new DecimalFormat("###,##0.");
			} else if (from.length() - from.indexOf(".") - 1 == 1) {
				df = new DecimalFormat("###,##0.0");
			} else {
				df = new DecimalFormat("###,##0.00");
			}
		} else {
			df = new DecimalFormat("###,##0");
		}
		double number = 0.0;
		try {
			number = Double.parseDouble(from);
		} catch (Exception e) {
			number = 0.0;
		}
		return df.format(number);
	}

}
