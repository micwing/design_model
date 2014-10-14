package com.onekr.designmodel.command;

import java.util.Vector;

public class CommandHistoryManager implements CommandManager {
	Vector<Command> undoList = new Vector<Command>();
	Vector<Command> redoList = new Vector<Command>();

	public void storeCommand(Command cmd) {
		undoList.add(cmd);
	}

	public void clearAllCommand() {
		undoList.clear();
		redoList.clear();
	}

	public void undo() {
		if (undoList.size() <= 0)
			return;
		Command cmd = ((Command) (undoList.get(undoList.size() - 1)));
		cmd.undo();
		undoList.remove(cmd);
		redoList.add(cmd);
	}

	public void redo() {
		if (redoList.size() <= 0)
			return;
		Command cmd = ((Command) (redoList.get(redoList.size() - 1)));
		cmd.execute();
		redoList.remove(cmd);
		undoList.add(cmd);

	}

}