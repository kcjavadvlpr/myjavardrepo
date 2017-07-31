package com.exercse.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.web.multipart.MultipartFile;

import com.exercse.entity.FileMetaDataInfo;

public class FileUtil {
	public static FileMetaDataInfo saveMetaDataInfo(MultipartFile  mfile) throws UnsupportedEncodingException, IOException {		
		String metaData = new String(mfile.getBytes(), "UTF-8");
		String[] metaDataArr  = metaData.split(",");
		return copyToMetaDataInfo(metaDataArr);
	}	
	
	private static FileMetaDataInfo copyToMetaDataInfo(String[] metaDataArr){
		FileMetaDataInfo metaDataInfo = new FileMetaDataInfo();
		metaDataInfo.setFileName(metaDataArr[0]);
		metaDataInfo.setFileType(metaDataArr[1]);
		metaDataInfo.setFileSize(metaDataArr[2]);		
		return metaDataInfo;	
	}
}
