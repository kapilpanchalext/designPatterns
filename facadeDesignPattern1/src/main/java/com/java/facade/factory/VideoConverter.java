package com.java.facade.factory;

import java.io.File;

public class VideoConverter {
	public File convert(String filename, String format) {
		VideoFile file = new VideoFile(filename);
		Codec sourceCodec = new CodecFactory().extract(file);
		Codec destinationCodec;
		
		if(format.equals("mp4")) {
			destinationCodec = new MPEG4CompressionCodec();
		} else {
			destinationCodec = new OggCompressionCodec();
		}
		
		byte[] buffer = BitrateReader.read(filename, sourceCodec);
		byte[] result = BitrateReader.convert(buffer, destinationCodec);
		
		result = new AudioMixer().fix(result);
		
		return new File("Converted: " + format);
	}
}
