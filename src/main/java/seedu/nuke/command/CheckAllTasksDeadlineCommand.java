package seedu.nuke.command;

import seedu.nuke.data.DataManager;

import java.util.ArrayList;

import static seedu.nuke.util.Message.MESSAGE_NO_TASK_IN_LIST;
import static seedu.nuke.util.Message.MESSAGE_TASK_LIST_SUCCESSFUL;

public class CheckAllTasksDeadlineCommand extends Command{
    protected DataManager dataManager;
    private ArrayList<String> deadlines;

    public static final String COMMAND_WORD = "tlst";
    public static final String MESSAGE_USAGE = COMMAND_WORD;

    @Override
    /**
     * module level
     */
    public CommandResult execute() {
        //get the large task list
        dataManager = new DataManager(moduleManager);
        if (dataManager.countAllTasks() == 0){
            return new CommandResult(MESSAGE_NO_TASK_IN_LIST);
        }
        deadlines = dataManager.checkDeadline();
        return new CommandResult(String.format(MESSAGE_TASK_LIST_SUCCESSFUL, dataManager.countAllTasks()));
    }
}
