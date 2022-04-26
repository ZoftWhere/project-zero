package app.zoftwhere.project.zero.scope;

import app.zoftwhere.project.zero.terminal.PromptBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PromptBuilderDebug {

    @Test
    void showPromptFor() {
        var prompt = new PromptBuilder()
                .addUserName()
                .addString("@")
                .addFullHostName()
                .addString(" ")
                .addWorkingDirectory()
                .addNewLineCharacter()
                .addPromptUID()
                .addString(" ")
                .toString();
        assertEquals("\\u@\\H \\w\\n\\$ ", prompt);
    }

    @Test
    void testPromptDirectory() {
        var prompt = new PromptBuilder()
            .addUserName()
            .addString("@")
            .addFullHostName()
            .addString(" ")
            .addCurrentDirectory()
            .addCarriageReturnCharacter()
            .addPromptUID()
            .addString(" ")
            .toString();
        assertEquals("\\u@\\H \\W\\r\\$ ", prompt);
    }
}
