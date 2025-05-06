package com.java.bridge.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultiThreadExecution implements ExecutionStrategy {

	@Override
	public void execute(Runnable task) {
		log.info("Executing Task on Multi Thread");
		new Thread(task).start();
	}

}
