package com.java.facade.factory;

public class CodecFactory {

	public Codec extract(VideoFile file) {
		return new MPEG4CompressionCodec();
	}
}
