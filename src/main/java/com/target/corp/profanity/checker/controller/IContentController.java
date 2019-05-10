package com.target.corp.profanity.checker.controller;

import com.target.corp.profanity.checker.entity.ProfanityCheckResponse;
import com.target.corp.profanity.checker.entity.UserComments;

public interface IContentController {
     ProfanityCheckResponse filterComment(UserComments userComments);
}
