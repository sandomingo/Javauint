

public class uint16 {
	private int value;

	public uint16() {
	}

	public uint16(int v) {
		this.value = v;
	}

	public byte[] toBytes() {
		byte[] b = new byte[2];
		b[1] = (byte) (value & 0xff);
		b[0] = (byte) (value >> 8 & 0xff);
		return b;
	}

	public static uint16 fromBytes(byte[] b) {
		uint16 result = new uint16();
		result.value = (b[0] << 8 )& 0xff00 + b[1] & 0xff;
		return result;
	}

	public String toString() {
		return String.valueOf(this.value);
	}

	public int getValue() {
		return this.value;
	}
}
