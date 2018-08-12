package com.fexo.json;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.IOUtils;

import java.io.IOException;
import java.io.InputStream;


/**
 * @author  wangfeixiong
 */
public class JsonToClass {

    public static void main(String[] args) throws IOException {
        InputStream inputStream =JsonToClass.class.getResourceAsStream("/user.json");
        User user = JSONObject.parseObject(inputStream, IOUtils.UTF8, User.class);
        System.out.println(user);
    }
}
