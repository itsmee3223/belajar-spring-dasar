package belajar.spring.dasar.core.commandapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@SpringBootApplication
public class CommandLineRunnerApplication {
    @Slf4j
    @Component
    public static class LogCommandLineRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            log.info("run with args, {}", Arrays.toString(args));
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(CommandLineRunnerApplication.class, args);
    }
}
