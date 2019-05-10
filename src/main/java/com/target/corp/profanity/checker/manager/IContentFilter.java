package com.target.corp.profanity.checker.manager;

import com.target.corp.profanity.checker.entity.ProfanityCheckResponse;

public interface IContentFilter {
    public ProfanityCheckResponse filter(String comment);
}
