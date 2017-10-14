package com.cattsoft.web;

import com.cattsoft.entity.User;
import com.cattsoft.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class);

    @Resource
    private UserService userService;

    //创建线程安全的Map
    static Map<Long, User> users = Collections.synchronizedMap(new HashMap<Long, User>());

    @RequestMapping(value="/", method=RequestMethod.GET)
    public List<User> getUserList(){
//        // 处理"/users/"的GET请求，用来获取用户列表
//        // 还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
//        List<User> list = new ArrayList<User>(users.values());
//        return list;
        logger.debug("select all users ...");
        return userService.selectAll();
    }


    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        // 处理"/users/{id}"的GET请求，用来获取url中id值的User信息
        // url中的id可通过@PathVariable绑定到函数的参数中
        return users.get(id);
    }

    /**
     * http://localhost:8080/users/put?name=jack&age=12
     * @param user
     * @return
     */
    @RequestMapping(value = {"/put"}, method = { RequestMethod.GET,RequestMethod.POST })
    public String putUser(@ModelAttribute User user) {
        logger.debug("新增用户");
        // 处理"/users/{id}"的PUT请求，用来更新User信息
        userService.add(user);
        users.put(user.getId(), user);
        return "更新用户  信息成功！";//"+id+"
    }


    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
