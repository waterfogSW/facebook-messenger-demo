package com.example.facebookdemo.facebook.model;

import java.util.Map;

public record FacebookMessaging(
        Map<String,String> sender,
        Map<String,String> recipient,
        Long timestamp,
        FacebookMessage message
) {
}
