package com.github.task_manage.domain.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class TaskRevisionHistory {
	private int taskRevisionId;
	private int taskId;
	private String taskName;
	private String taskDetail;
	private int doneFlag;
	private int deletedFlag;
	private Timestamp insertDateTimes;
}
