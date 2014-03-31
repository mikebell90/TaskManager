package com.mjbkerry.taskmanager.domain;

import java.util.Set;

/**
 * Secures the Node
 * @author mjb
 *
 */
public class SecuredNode extends Node {
	private Set<ACL> rights;

	public Set<ACL> getRights() {
		return rights;
	}

	public void setRights(Set<ACL> rights) {
		this.rights = rights;
	}

}
