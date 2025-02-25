package com.inclusiveedu;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonalizedLearningPlans {

    public List<String> getLearningPlans() {
        return Arrays.asList(
                "Learning Plan 1: Focus on basic math skills.",
                "Learning Plan 2: Emphasis on reading comprehension.",
                "Learning Plan 3: Advanced science projects for gifted students."
        );
    }
}