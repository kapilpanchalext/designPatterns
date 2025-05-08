package com.java.facade.factory;

public class BitrateReader {

	public static byte[] read(String filename, Codec codec) {
		return new byte[0];
	}
	
	public static byte[] convert(byte[] buffer, Codec codec) {
		return buffer;
	}
}
