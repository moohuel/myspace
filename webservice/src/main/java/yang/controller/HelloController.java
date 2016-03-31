package yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Naver on 2015-12-18.
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(Map<String, String> param) {

        System.out.println("Hello");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        return mav;
    }

    @RequestMapping("/helloJavascript")
    public ModelAndView helloJavascript(Map<String, String> param) {

        System.out.println("Hello");

        ModelAndView mav = new ModelAndView();
        mav.setViewName("helloJavascript");
        return mav;
    }
}
