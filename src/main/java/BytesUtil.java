public class BytesUtil {
	/**
	 * 返回字节数组中根据index指定的部分[beginIndex, endIndex)
	 * 
	 * @param b
	 * @param beginIndex
	 * @param endIndex
	 * @return
	 */
	public static byte[] subBytes(byte[] b, int beginIndex, int endIndex) {
		int length = b.length;
		// input is not correct
		if (endIndex <= beginIndex || beginIndex > length - 1)
			throw new IndexOutOfBoundsException();
		byte[] result = new byte[endIndex - beginIndex];
		for (int pos = beginIndex, i = 0; pos < endIndex; i++, pos++) {
			result[i] = b[pos];
		}
		return result;
	}

	/**
	 * 返回字节数组中从指定index开始的部分
	 * 
	 * @param b
	 * @param beginIndex
	 * @return
	 */
	public static byte[] subBytes(byte[] b, int beginIndex) {
		int length = b.length;
		int endIndex = length;
		return subBytes(b, beginIndex, endIndex);
	}

	/**
	 * 输出byte[]数组中每个字节的16进制值和10进制值
	 * 
	 * @param bt
	 */
	public static void printbyte(byte[] bt) {
		for (int i = 0; i < bt.length; i++) {

			int hex = (int) bt[i] & 0xff;
			System.out.print(Integer.toHexString(hex) + " ");
		}
		System.out.println(" length = " + bt.length + "\tin Hex");
		for (int i = 0; i < bt.length; i++) {

			int v = (int) bt[i] & 0xff;
			System.out.print(v + " ");
		}
		System.out.println(" length = " + bt.length + "\tin Decimal");
	}

	/**
	 * 将多个byte[]联结成一个byte[]
	 * 
	 * @param array
	 * @return
	 */
	public static byte[] concatenate(byte[]... array) {
		int length = 0;
		for (byte[] b : array) {
			length += b.length;
		}
		byte[] result = new byte[length];
		int i = 0;
		for (byte[] b : array) {
			for (byte bb : b) {
				result[i] = bb;
				i++;
			}
		}
		return result;
	}

	/**
	 * 获取byte数组的填充块，使用'\0'做填充
	 * @param num
	 * @return
	 */
	public static byte[] getPadding(int num) {
		byte[] b = new byte[num];
		for (int i = 0; i < num; i++) {
			b[i] = '\0';
		}
		return b;
	}
}
