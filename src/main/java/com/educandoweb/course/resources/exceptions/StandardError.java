package com.educandoweb.course.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant timestamps;
	private Integer status;
	private String error;
	private String messager;
	private String path;

	public StandardError() {
	}

	public StandardError(Instant timestamps, Integer status, String error, String messager, String path) {
		this.timestamps = timestamps;
		this.status = status;
		this.error = error;
		this.messager = messager;
		this.path = path;
	}

	public Instant getTimestamps() {
		return timestamps;
	}

	public void setTimestamps(Instant timestamps) {
		this.timestamps = timestamps;
	}

	public Integer getStaus() {
		return status;
	}

	public void setStaus(Integer staus) {
		this.status = staus;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessager() {
		return messager;
	}

	public void setMessager(String messager) {
		this.messager = messager;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
