package com.catholic.meowlife.application.view;

import com.catholic.meowlife.config.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MainView mainView = context.getBean("mainView", MainView.class);
        mainView.mainView();
    }
}
