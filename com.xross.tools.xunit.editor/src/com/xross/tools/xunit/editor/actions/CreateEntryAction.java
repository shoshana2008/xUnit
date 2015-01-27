package com.xross.tools.xunit.editor.actions;

import org.eclipse.gef.commands.Command;
import org.eclipse.ui.IWorkbenchPart;

import com.xross.tools.xunit.editor.commands.AddEntryCommand;
import com.xross.tools.xunit.editor.model.UnitConfigure;

public class CreateEntryAction extends BaseDialogAction {
	private String catName;
	private UnitConfigure configure;
	public CreateEntryAction(IWorkbenchPart part, String catName, UnitConfigure configure){
		super(part, CREATE_PROPERTY, CREATE_PROPERTY, "");
		this.catName = catName;
		setText(CREATE_PROPERTY + " for " + catName);
		this.configure = configure;
	}

	protected Command createCommand(String value) {
		return new AddEntryCommand(configure, catName, value);
	}
}
