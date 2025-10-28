package com.example.AURA_BE.record.sleep;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@RequiredArgsConstructor
public class SleepService {

    private final SleepRepository sleepRepository;

    public SleepResponse saveSleepRecord(SleepRequest request) {
        SleepRecord record = SleepRecord.builder()
                .userId(request.getUserId())
                .sleepTime(request.getSleepTime())
                .wakeTime(request.getWakeTime())
                .condition(request.getCondition())
                .createdAt(LocalDateTime.now())
                .build();

        SleepRecord saved = sleepRepository.save(record);

        return SleepResponse.builder()
                .success(true)
                .message("수면 기록이 성공적으로 저장되었습니다.")
                .data(
                        SleepResponse.Data.builder()
                                .recordId(saved.getRecordId())
                                .createdAt(saved.getCreatedAt()
                                        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss")))
                                .build()
                )
                .build();
    }
}
