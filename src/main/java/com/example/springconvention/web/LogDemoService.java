package com.example.springconvention.web;

import com.example.springconvention.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    private final MyLogger myLogger;

    public void logic(String id) {
        myLogger.log("서비스로 넘어온 id는 = " + id);
    }
}
