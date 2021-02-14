package br.com.rutiyama.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingsService {
    public String greeting(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello ");
        sb.append(s);
        return "Hello " + s;
    }
}

