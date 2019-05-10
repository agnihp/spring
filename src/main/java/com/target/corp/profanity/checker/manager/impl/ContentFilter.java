package com.target.corp.profanity.checker.manager.impl;

import com.target.corp.profanity.checker.dao.FilteredWords;
import com.target.corp.profanity.checker.entity.ProfanityCheckResponse;
import com.target.corp.profanity.checker.entity.UserComments;
import com.target.corp.profanity.checker.manager.IContentFilter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContentFilter implements IContentFilter {

    private FilteredWords filteredWords;

    @Autowired
    public ContentFilter (FilteredWords filteredWords) {
        this.filteredWords=filteredWords;
    }
    @Autowired

    @Override
    public ProfanityCheckResponse filter(UserComments comment) {
        String[] words= comment.getComment().split("\\W+");
        List<String> badWords= Arrays.stream(words).filter(word-> filteredWords.getFilterWords().contains(word)).collect(Collectors.toList());
        ProfanityCheckResponse  response= new ProfanityCheckResponse();
        if(badWords.isEmpty()) {
            response.setClean(true);
            response.setScore(0.0);
        } else {
            response.setClean(false);
            double score= 1- ((double)words.length)/(badWords.size());
            double roundedvalue=  round(score,2);
            response.setScore(roundedvalue);
        }
        return response;
    }

    private double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

}
