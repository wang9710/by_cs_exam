package com.examine.beyondsoft_qf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/01/17.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public  String getIndex() {
        return "index";
    }

}
