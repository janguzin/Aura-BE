package com.example.AURA_BE.record.sleep;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SleepResponse {
    private boolean success;
    private String message;
    private Data data;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @Builder
    public static class Data {
        private Long recordId;
        private String createdAt;
    }
}
