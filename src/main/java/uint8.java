

public class uint8 {
	private short value;

	public uint8() {
	}

	public uint8(short v) {
		this.value = v;
	}

	public byte[] toBytes() {
		byte[] b = new byte[1];
		b[0] = (byte) value;
		return b;
	}

	public byte toByte() {
		byte b = (byte) value;
		return b;
	}

	public static uint8 fromBytes(byte[] b) {
		byte bb = b[0];
		return fromBytes(bb);
	}

	public static uint8 fromBytes(byte b) {
		uint8 result = new uint8();
		result.value = (short) (b & 0x00ff);
		return result;
	}

	public String toString() {
		return String.valueOf(this.value);
	}

	public short getValue() {
		return this.value;
	}
}
