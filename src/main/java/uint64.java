

import java.math.BigInteger;

public class uint64 {
	private BigInteger value;

	public uint64() {
	}

	public uint64(BigInteger v) {
		this.value = v;
	}

	public byte[] toBytes() {
		byte[] b = new byte[8];
		BigInteger bigInt = new BigInteger("255");
		for (int i = 0; i < 8; i++) {
			b[i] = (value.shiftRight((7 - i) * 8).and(bigInt).byteValue());
		}
		return b;
	}

	public static uint64 fromBytes(byte[] b) {
		uint64 result = new uint64();
		result.value = new BigInteger(b);
		return result;
	}

	public String toString() {
		return String.valueOf(this.value);
	}

	public BigInteger getValue() {
		return this.value;
	}
}
