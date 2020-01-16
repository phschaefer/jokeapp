package com.phschaefer.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return  new ChuckNorrisQuotes();
    }
}
