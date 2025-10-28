package com.example.AURA_BE.record.sleep;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SleepRequest {
    private Long userId;
    private String sleepTime;
    private String wakeTime;
    private String condition;
}
