package com.mjbkerry.taskmanager.domain;

import java.io.Serializable;

public class Field {
	private FieldType type;
	private Serializable value;
	private long modification; // a fancier Version object might be neede
	public FieldType getType() {
		return type;
	}
	public void setType(FieldType type) {
		this.type = type;
	}
	public Serializable getValue() {
		return value;
	}
	public void setValue(Serializable value) {
		this.value = value;
	}
	public long getModification() {
		return modification;
	}
	public void setModification(long modification) {
		this.modification = modification;
	}
	
}
