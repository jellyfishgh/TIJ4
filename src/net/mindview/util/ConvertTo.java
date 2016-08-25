package net.mindview.util;

public class ConvertTo {
	// Boolean -> boolean
	public static boolean[] primitive(Boolean[] bls) {
		boolean[] result = new boolean[bls.length];
		for (int i = 0; i < bls.length; i++) {
			result[i] = bls[i];
		}
		return result;
	}

	// Byte -> byte
	public static byte[] primitive(Byte[] bs) {
		byte[] result = new byte[bs.length];
		for (int i = 0; i < bs.length; i++) {
			result[i] = bs[i];
		}
		return result;
	}

	// Short -> short
	public static short[] primitive(Short[] ss) {
		short[] result = new short[ss.length];
		for (int i = 0; i < ss.length; i++) {
			result[i] = ss[i];
		}
		return result;
	}

	// Integer -> int
	public static int[] primitive(Integer[] is) {
		int[] result = new int[is.length];
		for (int i = 0; i < is.length; i++) {
			result[i] = is[i];
		}
		return result;
	}

	// Long -> long
	public static long[] primitive(Long[] ls) {
		long[] result = new long[ls.length];
		for (int i = 0; i < ls.length; i++) {
			result[i] = ls[i];
		}
		return result;
	}

	// Double -> double
	public static double[] primitive(Double[] ds) {
		double[] result = new double[ds.length];
		for (int i = 0; i < ds.length; i++) {
			result[i] = ds[i];
		}
		return result;
	}

	// Float -> float
	public static float[] primitive(Float[] fs) {
		float[] result = new float[fs.length];
		for (int i = 0; i < fs.length; i++) {
			result[i] = fs[i];
		}
		return result;
	}

	// Character -> char
	public static char[] primitive(Character[] cs) {
		char[] result = new char[cs.length];
		for (int i = 0; i < cs.length; i++) {
			result[i] = cs[i];
		}
		return result;
	}
}
