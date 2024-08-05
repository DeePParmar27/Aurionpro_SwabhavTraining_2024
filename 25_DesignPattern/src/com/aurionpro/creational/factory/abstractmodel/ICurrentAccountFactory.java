package com.aurionpro.creational.factory.abstractmodel;

public interface ICurrentAccountFactory {
  public IAccount accountOpening(int accountNumber, String name, int balance , int overDraftLimit) ;
}
