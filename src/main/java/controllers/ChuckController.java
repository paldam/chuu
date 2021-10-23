package controllers;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ChuckController implements ErrorController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getJokes(Model model) {
//        List<UserInfo> users = userService.getUsers();
//        model.addAttribute("users", users);
//        model.addAttribute("userInfo", new UserInfo());
        return "jokes";
    }

    @RequestMapping(path = "home")
    public ModelAndView start() {
//        List<UserInfo> users = userService.getUsers();
//        model.addAttribute("users", users);
//        model.addAttribute("userInfo", new UserInfo());
        return new ModelAndView("jokes");
    }

    @GetMapping("jokes")
    public String showSignUpForm() {
        return "jokes";
    }

}
