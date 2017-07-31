package com.exercse.entity;

public class FileMetaDataInfo {	
	private String fileName;
	private String fileType;
	private String fileSize;
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	
	@Override
	public String toString() {
		return "FileMetaDataInfo [fileName=" + fileName + ", fileType=" + fileType + ", fileSize=" + fileSize + "]";
	}

}
