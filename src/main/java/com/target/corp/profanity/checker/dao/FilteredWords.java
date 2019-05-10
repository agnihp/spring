package com.target.corp.profanity.checker.dao;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class FilteredWords {
    private Set<String> filterWords= new HashSet<>();

    public Set<String> getFilterWords() {
        return filterWords;
    }

    @PostConstruct
    public void addWords() {
        filterWords.add("");
    }
}
