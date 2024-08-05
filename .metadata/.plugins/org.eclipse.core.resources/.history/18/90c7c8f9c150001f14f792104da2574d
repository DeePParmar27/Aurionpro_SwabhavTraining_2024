package com.aurionpro.behavioural.StrategyPattern.test;

import com.aurionpro.behavioural.StrategyPattern.model.AddOperation;
import com.aurionpro.behavioural.StrategyPattern.model.MultiplicationOperation;
import com.aurionpro.behavioural.StrategyPattern.model.OperationStrategy;

public class OperationTest {
public static void main(String[] args) {
	OperationStrategy op = new OperationStrategy(new AddOperation());
	op.doOperatio(12, 12);
	op.setOperation(new MultiplicationOperation());
	op.doOperatio(12, 12);
}
}
