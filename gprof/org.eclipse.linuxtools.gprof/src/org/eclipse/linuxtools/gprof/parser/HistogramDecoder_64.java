package org.eclipse.linuxtools.gprof.parser;

import java.io.DataInput;
import java.io.IOException;

public class HistogramDecoder_64 extends HistogramDecoder {
	
	public HistogramDecoder_64(GmonDecoder decoder) {
		super(decoder);
	}
	
	protected long readAddress(DataInput stream) throws IOException {
		long ret = stream.readLong();
		return ret;
	}

	
}
