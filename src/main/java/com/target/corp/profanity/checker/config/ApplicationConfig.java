package com.target.corp.profanity.checker.config;

import com.target.corp.profanity.checker.manager.IContentFilter;
import com.target.corp.profanity.checker.manager.impl.ContentFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    IContentFilter contentFilter() {
        return new ContentFilter();
    }

}
