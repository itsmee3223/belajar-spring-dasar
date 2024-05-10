package belajar.spring.dasar.core.service;

import belajar.spring.dasar.core.data.User;
import belajar.spring.dasar.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password){
        if(isLoggin(username, password)){
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
        }
        return false;
    }

    private boolean isLoggin(String username, String password) {
        return "ramanda".equals(username) && "ramanda".equals(password);
    }
}
