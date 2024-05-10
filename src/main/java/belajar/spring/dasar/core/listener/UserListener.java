package belajar.spring.dasar.core.listener;

import belajar.spring.dasar.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserListener {
    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event){
        log.info("success login for user {}", event.getUser());
    }
    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent2(LoginSuccessEvent event){
        log.info("success login for user {}", event.getUser());
    }
    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent3(LoginSuccessEvent event){
        log.info("success login for user {}", event.getUser());
    }
}
