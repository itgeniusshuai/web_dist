package com.boot.controller;

import com.boot.common.GlobalResult;
import com.boot.domain.Message;
import com.boot.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.annotation.SubscribeMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chart")
public class ChartController {

    @Autowired
    private SendService sendService;
    @MessageMapping("/chart/send")
    public GlobalResult send(Message message){
        System.out.print(message.getContent());
        sendService.send(message);
        return GlobalResult.ok();
    }

    @SubscribeMapping("/chart")
    public GlobalResult subcribeTopic(Message message){
        System.out.print("dfsdfsdf");
        return GlobalResult.ok();
    }
}
