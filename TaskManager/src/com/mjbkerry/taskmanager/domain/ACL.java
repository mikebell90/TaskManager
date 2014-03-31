package com.mjbkerry.taskmanager.domain;

import java.util.Set;


/**
 * Represents a right and the person or group connected
 * @author mjb
 *
 */
public class ACL { 
		private Identity identity;
		private Set<Right> rights;

		public Set<Right> getRights() {
			return rights;
		}

		public void setRights(Set<Right> rights) {
			this.rights = rights;
		}

		public Identity getIdentity() {
			return identity;
		}

		public void setIdentity(Identity identity) {
			this.identity = identity;
		}
}
