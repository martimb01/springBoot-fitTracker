package com.example.fitTracker.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }

    Optional<Run> findById(Integer id) {
        return runs.stream()
                .filter(run -> run.id().equals(id))
                .findFirst();
    }

    void create (Run run) {
        runs.add(run);
    }

    // Adding some runs in-memory for now
    @PostConstruct
    private void init() {
        runs.add(new Run(1,
                "Morning Jog",
                LocalDateTime.now(),
                LocalDateTime.now().plus(2, ChronoUnit.HOURS),
                10,
                Location.INDOOR));

        runs.add(new Run(2,
                "Night Jog",
                LocalDateTime.now(),
                LocalDateTime.now().plus(1, ChronoUnit.HOURS),
                24,
                Location.OUTDOOR));
    }

}
