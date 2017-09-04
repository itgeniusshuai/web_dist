package com.boot.service.impl;

import com.boot.domain.Message;
import com.boot.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class SendServiceImpl implements SendService{
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @Override
    public int send(Message message) {
        simpMessagingTemplate.convertAndSend("/topic/chart",message);
        return 1;
    }
}
