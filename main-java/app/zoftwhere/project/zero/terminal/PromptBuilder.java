package app.zoftwhere.project.zero.terminal;

public class PromptBuilder {

    private final String prompt;

    public PromptBuilder() {
        this.prompt = "";
    }

    private PromptBuilder(String prompt) {
        this.prompt = prompt;
    }

    public PromptBuilder addHostName() {
        return new PromptBuilder(prompt + "\\h");
    }

    public PromptBuilder addFullHostName() {
        return new PromptBuilder(prompt + "\\H");
    }

    public PromptBuilder addString(String string) {
        return new PromptBuilder(prompt + string);
    }

    public PromptBuilder addUserName() {
        return new PromptBuilder(prompt + "\\u");
    }

    private String escaped(String string) {
        StringBuilder builder = new StringBuilder();
        for (byte b : string.getBytes()) {
            builder.append(String.format("\\%1$03o", b));
        }
        return builder.toString();
    }

    public PromptBuilder addWorkingDirectory() {
        return new PromptBuilder(prompt + "\\w");
    }

    public PromptBuilder addCurrentDirectory() {
        return new PromptBuilder(prompt + "\\W");
    }

    public PromptBuilder addCarriageReturnCharacter() {
        return new PromptBuilder(prompt + "\\r");
    }

    public PromptBuilder addNewLineCharacter() {
        return new PromptBuilder(prompt + "\\n");
    }

    public PromptBuilder addPromptUID() {
        return new PromptBuilder(prompt + "\\$");
    }

    @Override
    public String toString() {
        return prompt;
    }
}
