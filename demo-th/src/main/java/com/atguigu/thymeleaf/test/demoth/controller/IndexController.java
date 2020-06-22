package com.atguigu.thymeleaf.test.demoth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * @author chujian
 * @create 2020-06-20 13:56
 */
@Controller
public class IndexController {
    @RequestMapping("item")
    public String item(HttpServletRequest request, HttpSession httpSession) {

        //返回页面！！
        request.setAttribute("hotKey", "离婚热点");


        //测试循环
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("文章");
        arrayList.add("双宋");
        arrayList.add("蔡徐坤");
        arrayList.add("李晨");
        arrayList.add("马蓉");
        request.setAttribute("arrayList", arrayList);

        //测试判断
        request.setAttribute("age", 18);

        //取session中的属性
        httpSession.setAttribute("job", "IT软件工程师");
        return "index";

    }
}
