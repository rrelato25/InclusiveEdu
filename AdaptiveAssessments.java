package com.inclusiveedu;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class AdaptiveAssessments {

    public List<String> getAssessments() {
        return Arrays.asList(
                "Assessment 1: Basic math quiz that adapts to student's skill level.",
                "Assessment 2: Reading comprehension test with adaptive difficulty.",
                "Assessment 3: Science quiz that adjusts questions based on previous answers."
        );
    }
}