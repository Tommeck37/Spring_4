package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;

@Controller
public class SessionController {

    @GetMapping("/session")
    @ResponseBody
    public String getSessionValue(HttpSession session) {
        if (session.getAttribute("loginStart") == null) {
            session.setAttribute("loginStart", LocalDateTime.now().toString());
        }

        return session.getAttribute("loginStart").toString();
    }

    @GetMapping("/session2") //To nie zadziała bo jak wstrzykujemy to on mowi ze nie ma, no szkoda
    @ResponseBody
    public String getSessionValue2(@SessionAttribute( name = "loginStart", required = false) String loginStart) {
        if (loginStart == null) {
            return LocalDateTime.now().toString();
        } else {
            return loginStart;
        }
    }

}
