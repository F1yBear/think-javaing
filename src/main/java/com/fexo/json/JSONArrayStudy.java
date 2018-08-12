package com.fexo.json;

import com.alibaba.fastjson.JSONArray;
import org.junit.Test;

/**
 * @author  wangfeixiong
 */
public class JSONArrayStudy {

    public void print(){
        String jsonArray = "\"[{\"java\":\"test\"}]\"";
        if(jsonArray.endsWith("\"")){
            jsonArray = jsonArray.substring(1, jsonArray.lastIndexOf("\""));
        }

        JSONArray array = JSONArray.parseArray(jsonArray);
        System.out.println(array.getJSONObject(0).getString("java"));
    }
}
