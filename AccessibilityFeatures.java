package com.inclusiveedu;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class AccessibilityFeatures {

    public List<String> getAccessibilityFeatures() {
        return Arrays.asList(
                "Feature 1: Text-to-speech for all learning materials.",
                "Feature 2: High-contrast mode for visually impaired students.",
                "Feature 3: Customizable font sizes and styles."
        );
    }
}