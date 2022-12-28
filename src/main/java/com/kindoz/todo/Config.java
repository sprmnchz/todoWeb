package com.kindoz.todo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.kindoz.todo")
@EnableAspectJAutoProxy
public class Config {
}
