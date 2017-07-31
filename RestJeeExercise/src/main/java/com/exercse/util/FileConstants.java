package com.exercse.util;

import java.util.concurrent.ConcurrentHashMap;

import com.exercse.entity.FileMetaDataInfo;

public class FileConstants {
	
	public static  ConcurrentHashMap<String, FileMetaDataInfo> fileMetaDataMap = new ConcurrentHashMap<String, FileMetaDataInfo>();

}
