package com.sports.utils;

import com.sun.javafx.binding.DoubleConstant;
import com.sun.javafx.collections.MappingChange;
import com.sun.javafx.webkit.KeyCodeMap;
import org.apache.log4j.Logger;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Gundam on 2017/3/26.
 */
public class FileUploadingUtil {
    private static Logger logger = Logger.getLogger(FileUploadingUtil.class);
    public  static String FILEDIR =null;

    public static Map<String,String> upload(Map<String,MultipartFile> files) throws IOException{
        File file = new File(FILEDIR);
        if (!file.exists()){
            file.mkdir();
        }

        Map<String,String>result = new HashMap<>();
        for (Map.Entry<String, MultipartFile> stringMultipartFileEntry : files.entrySet()) {
            MultipartFile aFile = stringMultipartFileEntry.getValue();
            if (aFile.getSize() != 0 && !"".equals(aFile.getName())) {
                result.put(aFile.getOriginalFilename(), uploadFile(aFile));
            }
        }
        return result;
    }

    private static int getFileDir(String name){
        return name.hashCode() & 0xf;
    }

    private static String initFilePath(String name){
        String dir = getFileDir(name) + "";
        File file = new File(FILEDIR + dir);
        if (!file.exists()){
            file.mkdir();
        }
        Long num = new Date().getTime();
        Double d = Math.random()* num;
        return (file.getPath()+"/"+num+d.longValue()+"_"+name).replaceAll("","-");
    }



    private  static String uploadFile(MultipartFile aFile) throws  IOException{
        String filePath = initFilePath(aFile.getOriginalFilename());
        try{
            write(aFile.getInputStream(),new FileOutputStream(filePath));
        }catch (FileNotFoundException e){
            logger.error(aFile.getName() + " 上传的文件不存在");
            e.printStackTrace();
        }
        return filePath;
    }

    private static void write(InputStream in,OutputStream out) throws IOException{
        try{
            byte[] buffer = new byte[1024];
            int bytesRead = -1;
            while ((bytesRead  = in.read(buffer))!=-1){
                out.write(buffer,0,bytesRead);
            }
            out.flush();
        }finally {
            try{
                in.close();
                out.close();
            }catch (IOException ex){

            }
        }
    }

    public static Map<String,String> getFileMap(){
        logger.info(FileUploadingUtil.FILEDIR);
        Map<String,String> map = new HashMap<>();
        File[] files = new File(FileUploadingUtil.FILEDIR).listFiles();
        if (files != null){
            for(File file: files){
                if (file.isDirectory()){
                    File[] files2 = file.listFiles();
                    if(files2 != null){
                        for(File file2: files2){
                            String name = file2.getName();
                            logger.info(file2.getParentFile().getAbsolutePath());
                            logger.info(file2.getAbsolutePath());
                            map.put(file2.getParentFile().getName()+"/"+name,name.substring(name.lastIndexOf("_")+1));
                        }
                    }
                }
            }
        }
        return map;
    }

}
