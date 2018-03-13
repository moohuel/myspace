package yang.controller.react;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by JangYangsook on 2018-03-13.
 */

@Controller
public class ReactTestController {

    @RequestMapping("/reactHello")
    public ModelAndView hello(Map<String, String> param) {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("react/hello");
        return mav;
    }

}
