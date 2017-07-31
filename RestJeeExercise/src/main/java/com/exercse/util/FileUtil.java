package com.exercse.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.web.multipart.MultipartFile;

import com.exercse.entity.FileMetaDataInfo;

public class FileUtil {

	public static FileMetaDataInfo saveMetaDataInfo(MultipartFile  mfile) throws UnsupportedEncodingException, IOException {		
		System.out.println("FileUtil==>saveMetaDataInfo====>staert");
		String metaData = new String(mfile.getBytes(), "UTF-8");
		String[] metaDataArr  = metaData.split(",");
		return copyToMetaDataInfo(metaDataArr);
	}
	
	
	/*public static FileMetaDataInfo saveMetaDataInfo1(String fileName) {
		BufferedReader br = null;
		FileReader fr = null;
		String[] metaDataArr = new String[3];
		
		try {
			// br = new BufferedReader(new FileReader(FILENAME));
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String sCurrentLine;			
			
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				//String data = sCurrentLine;
				metaDataArr  = sCurrentLine.split(",");
				System.out.println("mydata==>"+metaDataArr[0]);
				System.out.println("mydata==>"+metaDataArr[1]);
				System.out.println("mydata==>"+metaDataArr[2]);
				break;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}		
		return copyToMetaDataInfo(metaDataArr);
	}
*/
/*	public static void main(String args[]){		
		FileUtil util = new FileUtil();
		util.saveMetaDataInfo("test.txt");		
	}*/
	
	private static FileMetaDataInfo copyToMetaDataInfo(String[] metaDataArr){
		FileMetaDataInfo metaDataInfo = new FileMetaDataInfo();
		metaDataInfo.setFileName(metaDataArr[0]);
		metaDataInfo.setFileType(metaDataArr[1]);
		metaDataInfo.setFileSize(metaDataArr[2]);	
		
		System.out.println("copyToMetaDataInfo==>"+metaDataInfo.getFileType());
		return metaDataInfo;
		
	}

}
