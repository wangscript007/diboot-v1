package com.diboot.components.file.audio;

import com.diboot.components.utils.RuntimeHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * 音频处理类
 * @author Mazc@dibo.ltd
 * @version 2016年11月7日
 *
 */
public class AudioHelper {
	private static final Logger logger = LoggerFactory.getLogger(AudioHelper.class);
	
	/***
	 * 将wav音频转换为MP3格式
	 * @param sourceFilePath
	 * @param targetFilePath
	 * @return
	 */
	public static String convertWavToMp3(String sourceFilePath, String targetFilePath){
		boolean success = RuntimeHelper.run("ffmpeg -i "+ sourceFilePath +" "+ targetFilePath); //  -ar 8000 -ac 1 -y 
		if(success){
			return targetFilePath;
		}
		else{
			return sourceFilePath;			
		}
	}
	
}