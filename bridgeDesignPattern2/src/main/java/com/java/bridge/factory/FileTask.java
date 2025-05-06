package com.java.bridge.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FileTask extends Task{

	public FileTask(ExecutionStrategy executionStrategy) {
		super(executionStrategy);
	}

	@Override
	public void run() {
		executionStrategy.execute(() -> {
			log.info("Processing file task...");
		});
	}

}
