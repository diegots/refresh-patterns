package main.com.company.command;

import java.util.ArrayList;
import java.util.List;

/* This is the Invoker class.
 * It's just a thin layer of abstraction that decouples the command objects from
 * their consumers. */
public class TextFileOperationExecutor {
    private final List<TextFileOperation> operations = new ArrayList<>();

    public String executeOperation(TextFileOperation operation) {
        operations.add(operation); // some additional operations can be implemented later
        return operation.execute();
    }
}
