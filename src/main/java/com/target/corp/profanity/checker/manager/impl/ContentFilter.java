package com.target.corp.profanity.checker.manager.impl;

import com.target.corp.profanity.checker.entity.ProfanityCheckResponse;
import com.target.corp.profanity.checker.manager.IContentFilter;

public class ContentFilter implements IContentFilter {
    @Override
    public ProfanityCheckResponse filter(String comment) {
        return null;
    }
}
