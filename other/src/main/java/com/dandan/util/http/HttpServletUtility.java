package com.dandan.util.http;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

public class HttpServletUtility {


    public static Map<String, String> getParamMap(HttpServletRequest request) throws UnsupportedEncodingException {
        Map<String, String> params = new TreeMap<String, String>();

        String paramName;
        String value;

        for(Enumeration paramNames = request.getParameterNames(); paramNames.hasMoreElements(); ){
            paramName = (String)paramNames.nextElement();
            value = request.getParameter(paramName);
            if(value == null){
                value = "";
            }
            params.put(paramName, value);
        }


        return params;
    }


}
