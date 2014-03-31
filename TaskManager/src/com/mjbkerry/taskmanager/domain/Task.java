package com.mjbkerry.taskmanager.domain;

import java.util.List;

public class Task extends Completion {
	
	private Priority priority;
	private Identity creator;
	private Identity assignee;
	
	private Completion completion;
	
	private List<Alarm> alarms;
	
	private int depth;
	
	private List<Field> fields;
	
	// The attachments
	private List<Item> items;
	
	
	
	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Identity getCreator() {
		return creator;
	}

	public void setCreator(Identity creator) {
		this.creator = creator;
	}

	public Identity getAssignee() {
		return assignee;
	}

	public void setAssignee(Identity assignee) {
		this.assignee = assignee;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Alarm> getAlarms() {
		return alarms;
	}

	public void setAlarms(List<Alarm> alarms) {
		this.alarms = alarms;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public Completion getCompletion() {
		return completion;
	}

	public void setCompletion(Completion completion) {
		this.completion = completion;
	}

	

}
