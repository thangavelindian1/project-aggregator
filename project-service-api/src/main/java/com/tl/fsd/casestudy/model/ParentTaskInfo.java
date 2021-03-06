package com.tl.fsd.casestudy.model;

/**
 * Parent Task Model Object
 * 
 * @author 456206
 *
 */
public class ParentTaskInfo {

	private int parentId;
	private String parentTaskName;
	private int projectId;

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getParentTaskName() {
		return parentTaskName;
	}

	public void setParentTaskName(String parentTaskName) {
		this.parentTaskName = parentTaskName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

}
