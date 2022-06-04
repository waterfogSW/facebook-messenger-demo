package com.example.facebookdemo.facebook;

import com.fasterxml.jackson.annotation.JsonProperty;

public record WebhookRequest(
        @JsonProperty("hub.mode")
        String mode,

        @JsonProperty("hub.verify_token")
        String token,

        @JsonProperty("hub.challenge")
        String challenge
) {
}
