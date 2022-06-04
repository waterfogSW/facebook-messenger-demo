package com.example.facebookdemo.facebook.model;

public record FacebookMessage(
        String mid,
        Long seq,
        String text
) {
}
