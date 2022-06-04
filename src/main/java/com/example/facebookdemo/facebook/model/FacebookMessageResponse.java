package com.example.facebookdemo.facebook.model;

import java.util.HashMap;
import java.util.Map;

public record FacebookMessageResponse(
        String messageType,
        Map<String, String> recipient,
        Map<String, String> message
) {
    public FacebookMessageResponse(String messageType) {
        this(messageType, new HashMap<>(), new HashMap<>());
    }
}
