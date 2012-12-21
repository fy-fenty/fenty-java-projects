package org.fengyao.test;

import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.hslf.model.Shape;
import org.apache.poi.hslf.model.TextBox;

public class MyShape extends TextBox {
	protected MyShape(EscherContainerRecord escherRecord, Shape parent) {
		super(escherRecord, parent);
	}

	public MyShape getClone() throws CloneNotSupportedException {
		return (MyShape) this.clone();
	}

	@Override
	protected EscherContainerRecord createSpContainer(boolean isChild) {
		return null;
	}
}
