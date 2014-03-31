package com.mjbkerry.taskmanager.domain;

/**
 * Base class. It's got some synchronization info, and base identity info, nothing more. 
 * @author mjb
 *
 */
public class Container {

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public long getModified() {
		return modified;
	}

	public void setModified(long modified) {
		this.modified = modified;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	private long created; // date in ms of creation
	private long modified; // date in ms of modification

	private String uuid; // something to uniquely identify;
}
