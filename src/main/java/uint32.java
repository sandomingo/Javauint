
public class uint32 {
	private long value;

	public uint32() {
	}

	public uint32(long v) {
		this.value = v;
	}

	public byte[] toBytes() {
		byte[] b = new byte[4];
		b[3] = (byte) (value & 0xff);
		b[2] = (byte) (value >> 8 & 0xff);
		b[1] = (byte) (value >> 16 & 0xff);
		b[0] = (byte) (value >> 24 & 0xff);
		return b;
	}

	public static uint32 fromBytes(byte[] b) {
		uint32 result = new uint32();
		result.value = b[0] << 24 & 0xff000000 + b[1] << 16
				& 0xff0000 + b[2] << 8 & 0xff00 + b[3] & 0xff;
		return result;
	}

	public String toString() {
		return String.valueOf(this.value);
	}

	public long getValue() {
		return this.value;
	}
}
