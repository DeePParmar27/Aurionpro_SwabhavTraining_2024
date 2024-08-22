package com.aurionpro.test;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Configurable
@ComponentScan(basePackages="com.aurionpro.model")
public class ApplicationConfig {


}
