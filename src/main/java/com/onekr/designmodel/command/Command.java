package com.onekr.designmodel.command;

public interface Command {
	public void execute();
	
	public void undo();
}
