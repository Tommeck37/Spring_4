package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CookieController {
    @GetMapping("/add-cookies")
    public String addCookie(HttpServletResponse response) {
        Cookie cookie1 = new Cookie("user", "Jan");
        cookie1.setMaxAge(10 * 60);
        Cookie cookie2 = new Cookie("uid", "ccb1b154-c4ff");
        cookie2.setMaxAge(10 * 24 * 60 * 60);
        Cookie cookie3 = new Cookie("IDE", "IntelliJ");
        cookie3.setMaxAge(30 * 24 * 60 * 60);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
        return "redirect:all-cookies";
    }
    @GetMapping("/all-cookies")
    public String displayCookie(Model model,HttpServletRequest request) {
        Cookie c = WebUtils.getCookie(request, "user");
        Cookie d = WebUtils.getCookie(request, "uid");
        Cookie e = WebUtils.getCookie(request, "IDE");
        List<Cookie> cookiez = new ArrayList<>();
        cookiez.add(c);
        cookiez.add(d);
        cookiez.add(e);
        model.addAttribute("ciastka", cookiez);

        return "webcookie";
    }

}
