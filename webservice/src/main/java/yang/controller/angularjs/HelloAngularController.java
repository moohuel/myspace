package yang.controller.angularjs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by naver-yang on 2016-04-03.
 */

@Controller
public class HelloAngularController {

    @RequestMapping("/angularjs/stories")
    public ModelAndView listOfData(Map<String, String> param) {

        ModelAndView mav = new ModelAndView();
        mav.addObject("myName", "yangsook");
        mav.setViewName("angularjs/stories");
        return mav;
    }

    @RequestMapping("/angularjs/helloAngular")
    public ModelAndView helloAngular(Map<String, String> param) {

        ModelAndView mav = new ModelAndView();
        mav.addObject("myName", "yangsook");
        mav.setViewName("angularjs/helloAngular");
        return mav;
    }
}
