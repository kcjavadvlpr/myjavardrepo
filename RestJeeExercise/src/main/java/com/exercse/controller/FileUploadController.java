package com.exercse.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.exercse.entity.FileMetaDataInfo;
import com.exercse.util.FileConstants;
import com.exercse.util.FileUtil;

@RestController
public class FileUploadController {

	@PostMapping("/api/v1/upload_file")
	public ResponseEntity<Void> uploadFile(@RequestParam("file") MultipartFile uploadfile) {
		if (uploadfile.isEmpty()) {
			return new ResponseEntity(HttpStatus.OK);
		}

		try {
			FileMetaDataInfo myFileMetaDataInfo = FileUtil.saveMetaDataInfo(uploadfile);
			FileConstants.fileMetaDataMap.put(myFileMetaDataInfo.getFileName(), myFileMetaDataInfo);
			
			System.out.println("FileUploadController====>uploadFile========Data======>"+FileConstants.fileMetaDataMap.get(myFileMetaDataInfo.getFileName()).getFileName());
			System.out.println("FileUploadController====>uploadFile========SIZE======>"+FileConstants.fileMetaDataMap.size());
			System.out.println("FileUploadController====>uploadFile==>ENDDDDDDDDDDDD");
			
			
		} catch (IOException e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity("Uploaded - " + uploadfile.getOriginalFilename(), new HttpHeaders(),
				HttpStatus.OK);
	}
	
	@GetMapping("/api/v1/view_meta_data")
	public ResponseEntity<Void> viewMetaDataInfo() {
		
		for (Map.Entry<String, FileMetaDataInfo>  metaData : FileConstants.fileMetaDataMap.entrySet()) {
			System.out.println("Saved MetaData====>" +metaData.toString());
		}	
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
