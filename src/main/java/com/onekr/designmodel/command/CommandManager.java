package com.onekr.designmodel.command;

public interface CommandManager {
	public void storeCommand(Command cmd);

	public void clearAllCommand();

	public void undo();

	public void redo();
}
