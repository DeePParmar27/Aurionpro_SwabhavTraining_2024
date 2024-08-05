package com.aurionpro.test;

import com.aurionpro.model.iSayable;
import com.aurionpro.model.sayableImp;

public class sayableTest {
public static void main(String[] args) {

iSayable sayable = () -> System.out.println("Hello World");
sayable.say();

}
}
