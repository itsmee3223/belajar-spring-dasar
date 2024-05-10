package belajar.spring.dasar.core.listener;

import belajar.spring.dasar.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;

@Slf4j
public class LoginAgainListener implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success login again for user {}", event.getUser());
    }
}
