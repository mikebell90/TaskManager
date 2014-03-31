package com.mjbkerry.taskmanager.domain;

import java.util.List;

/**
 * Adds "naviagtion" and basic note and naming
 * @author mjb
 *
 */
public class Node extends Container {
		private String displayName; // name to display of folder or task
		private String comment; // a comment
		
		private Node parent;
		private List<Node> children;
		public String getDisplayName() {
			return displayName;
		}
		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}
		public String getComment() {
			return comment;
		}
		public void setComment(String comment) {
			this.comment = comment;
		}
		public Node getParent() {
			return parent;
		}
		public void setParent(Node parent) {
			this.parent = parent;
		}
		public List<Node> getChildren() {
			return children;
		}
		public void setChildren(List<Node> children) {
			this.children = children;
		}
		
		

		
		
}
