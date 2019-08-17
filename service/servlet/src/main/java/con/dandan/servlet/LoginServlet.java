package con.dandan.servlet;


import com.alibaba.fastjson.JSON;
import com.dandan.servlet.impl.LoginService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LoginServlet extends HttpServlet {

    @Autowired
    private LoginService loginService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("GB2312");
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");

//        Map<String, String> parameters =  HttpServletUtility.getParamMap(request);
        Map<String, String> parameters =  new HashMap<>();
        if(parameters != null && parameters.size() > 0){
            Set<Map.Entry<String, String>> entries = parameters.entrySet();
            for (Map.Entry<String, String> entry : entries) {
//                if(entry.getKey().equals("accountName")){
//                    String name = new String(entry.getValue().getBytes("ISO-8859-1"), "UTF-8");
//                    entry.setValue(name);
//                }


                System.out.println(entry.getKey() + "==" + entry.getValue());
            }
        }

        //TODO 解决服务器端中文乱码问题
        //TODO mapper校验用户名和密码

    }



}
