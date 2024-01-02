package com.twiliosms.controller;

import com.twiliosms.payload.SMSRequest;
import com.twiliosms.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sms")
public class SMSController {

    private final SMSService smsService;

    @Autowired
    public SMSController(SMSService smsService) {
        this.smsService = smsService;
    }

    @PostMapping("/send-sms")
    public void sendSMS(@RequestBody SMSRequest request) {
        String to = request.getTo(); // Assuming your request has a phone number field
        String message = request.getMessage(); // Assuming your request has a message field
        smsService.sendSMS(to, message);
    }
}

