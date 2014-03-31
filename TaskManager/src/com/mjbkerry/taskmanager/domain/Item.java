package com.mjbkerry.taskmanager.domain;

import java.io.InputStream;

public abstract class Item {
	private long size;
	private long created;
	private String mimeType;
	// probably needs more synchronization thoughts
	
	protected String getMimeType() { return mimeType; }
	protected void setMimeType(String mimeType) { this.mimeType=mimeType; }

	public abstract InputStream getInputStream();
	
	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}
}
