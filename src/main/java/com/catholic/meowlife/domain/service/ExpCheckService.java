package com.catholic.meowlife.domain.service;
import org.springframework.stereotype.Component;

@Component
public class ExpCheckService {
    public boolean isExpReached100(int exp) {
        return exp >= 100;
    }
}
