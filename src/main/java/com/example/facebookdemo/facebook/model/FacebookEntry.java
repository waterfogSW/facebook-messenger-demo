package com.example.facebookdemo.facebook.model;

import java.util.List;

public record FacebookEntry(
        String id,
        Long time,
        List<FacebookMessaging> messaging
) {
}
