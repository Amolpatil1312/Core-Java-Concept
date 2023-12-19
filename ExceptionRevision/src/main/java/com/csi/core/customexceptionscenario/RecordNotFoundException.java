package com.csi.core.customexceptionscenario;

public class RecordNotFoundException extends RuntimeException {

	public RecordNotFoundException(String msg) {
		super(msg);
	}
}
