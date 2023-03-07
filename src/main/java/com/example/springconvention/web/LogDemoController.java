package com.example.springconvention.web;

import com.example.springconvention.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class LogDemoController {

    private final LogDemoService logDemoService;
    private final MyLogger myLogger;

    @RequestMapping("log-demo")
    @ResponseBody
    public String logDemo(HttpServletRequest request) {

        // 고객이 어떤 url로 요청했는지 알 수 있다.
        String requestURL = request.getRequestURL().toString();

        System.out.println("myLogger = " + myLogger.getClass());

        myLogger.setRequestURL(requestURL);

        myLogger.log("여기는 컨트롤러야.");
        logDemoService.logic("testId");
        return "OK";
    }
}