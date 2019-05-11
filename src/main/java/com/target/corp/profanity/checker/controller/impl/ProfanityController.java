package com.target.corp.profanity.checker.controller.impl;

import com.target.corp.profanity.checker.controller.IContentController;
import com.target.corp.profanity.checker.entity.ProfanityCheckResponse;
import com.target.corp.profanity.checker.entity.UserComments;
import com.target.corp.profanity.checker.manager.IContentFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter")
public class ProfanityController implements IContentController {

  @Autowired
  private IContentFilter contentFilter;




  @PostMapping(
      path = "/text",
      produces = MediaType.APPLICATION_JSON_VALUE,
      consumes = MediaType.APPLICATION_JSON_VALUE)
  @Override
  public ProfanityCheckResponse filterComment(UserComments userComments) {
    return contentFilter.filter(userComments);
  }
}
