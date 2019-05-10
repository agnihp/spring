package com.target.corp.profanity.checker.entity;

import lombok.Data;

@Data
public class ProfanityCheckResponse {
    Integer commentID;
    Boolean clean;
    Double score;
}
