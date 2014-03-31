package com.mjbkerry.taskmanager.domain;

public class Completion  {

	private long dueDate;
	private long estimatedTime;
	private long startTime;
	private boolean completed;
	private long completedDate;
	public long getDueDate() {
		return dueDate;
	}
	public void setDueDate(long dueDate) {
		this.dueDate = dueDate;
	}
	public long getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(long estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	public long getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(long completedDate) {
		this.completedDate = completedDate;
	}
	

}