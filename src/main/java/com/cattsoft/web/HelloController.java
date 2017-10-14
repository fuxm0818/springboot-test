package com.cattsoft.web;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.UUID;

@Controller
public class HelloController {

    private static final Logger logger = Logger.getLogger(HelloController.class);

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    /**
     * 使用thymeleaf模板例子
     * @param map
     * @return
     */
    @RequestMapping("/html")
    public String index(ModelMap map) {
        logger.debug("show html ...");
        map.addAttribute("host", "我在html模板中显示!!!");
        return "index";
    }

    @RequestMapping(value={"/","/jsp"})
    public String index(Map<String,Object> map) {
        logger.debug("show jsp ...");
        map.put("host", "我在jsp页面中显示!!!");
        return "welcome/index";
    }

    @ResponseBody  //增加这个注解，返回string对象，不加此注解，则查找对应的jsp页面
    @RequestMapping(value={"/uid"})
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return uid.toString();
    }

}