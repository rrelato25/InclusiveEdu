package com.inclusiveedu;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class CollaborativeTools {

    public List<String> getCollaborativeTools() {
        return Arrays.asList(
                "Tool 1: Peer tutoring system.",
                "Tool 2: Shared workspace for group projects.",
                "Tool 3: Communication platform for educators and students."
        );
    }
}