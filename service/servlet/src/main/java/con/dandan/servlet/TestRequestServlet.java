package con.dandan.servlet;

import com.alibaba.fastjson.JSON;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class TestRequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        Map<String, String> parameters =  HttpServletUtility.getParamMap(request);
        Map<String, String> parameters =  new HashMap<>();

        if(parameters != null && parameters.size() > 0){
            Set<Map.Entry<String, String>> entries = parameters.entrySet();
            for (Map.Entry<String, String> entry : entries) {
                System.out.println(entry.getKey() + "----" + entry.getValue());
            }
        }


        PrintWriter out = response.getWriter();
        response.setCharacterEncoding("UTF-8");
        //解决响应参数乱码问题
//        response.setHeader("Content-Type","text/html;charset=UTF-8");
        response.setHeader("Content-type","application/x-www-form-urlencoded");
        out.print(JSON.toJSON("ajax请求成功").toString());
        out.close();

    }


}
