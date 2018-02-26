package rmi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import rmi.client.HelloRMIService;

@Controller
@RequestMapping("/rmi")
public class rmiController {

    @Autowired
    private HelloRMIService helloRMIService;

    @RequestMapping("/login")
    @ResponseBody
    public String loginAuthenticate(@RequestParam int a) {
        int result = helloRMIService.getAdd(a,a);
        return Integer.toString(result);
    }
}
