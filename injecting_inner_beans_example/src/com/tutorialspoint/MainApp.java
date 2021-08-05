package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("Beans.xml");

        TextEditor te = ctx.getBean(TextEditor.class);
        te.spellCheck();
    }
}