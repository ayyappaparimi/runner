package dev.demo.runner.run;

import java.time.LocalDateTime;

public record Run (
        Integer id,
        String title,
        LocalDateTime StartedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location
) {}
