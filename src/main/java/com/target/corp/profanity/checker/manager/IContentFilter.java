package com.target.corp.profanity.checker.manager;

import com.target.corp.profanity.checker.entity.ProfanityCheckResponse;
import com.target.corp.profanity.checker.entity.UserComments;

public interface IContentFilter {
    ProfanityCheckResponse filter(UserComments comment);
}
