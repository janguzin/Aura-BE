package com.example.AURA_BE.record.sleep;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SleepRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recordId;

    private Long userId;
    private String sleepTime;
    private String wakeTime;
    private String condition;
    private LocalDateTime createdAt;
}
