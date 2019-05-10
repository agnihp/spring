package com.target.corp.profanity.checker.entity;

import lombok.Data;

@Data
public class UserComments {
    long commentId;
    long userId;
    String comment;
}
