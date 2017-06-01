package Util;

public class UUID {
	/**
	 * uuid
	 * @author mahui
	 * @return string
	 */
	public static String generate(){
		String uuidString = UUID.randomUUID().toString();
		String idString = uuidString.replace("-","");
		return idString;
	}

	private static Object randomUUID() {
		// TODO Auto-generated method stub
		return null;
	}
}
