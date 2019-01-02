package com.fexo.file;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author F1yBear
 */
public class FileUtils {

    public static void main(String[] args) {
        List<String> files = new ArrayList<>();
        files=  new FileUtils().getFiles("D:"+File.separator+"apache-maven-3.3.9",files);
        files.forEach(e->{
                    System.out.println(e.toString());
                }
        );
    }

    public List<String> getFiles(String filePath,List<String> files){
        File file = new File(filePath);
        if (!file.isDirectory()) {
            files.add(filePath+ file.getName());
        }else{
            for(String fileName:file.list()) {
                getFiles(filePath+File.separator+fileName,files);
            }
        }
        return files;
    }
}
