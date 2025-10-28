package com.example.AURA_BE.record.sleep;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/record/sleep")
@RequiredArgsConstructor
public class SleepController {

    private final SleepService sleepService;

    @PostMapping
    public SleepResponse createSleepRecord(@RequestBody SleepRequest request) {
        return sleepService.saveSleepRecord(request);
    }
}
