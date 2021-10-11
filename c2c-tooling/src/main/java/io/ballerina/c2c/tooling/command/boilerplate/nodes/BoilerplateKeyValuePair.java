package io.ballerina.c2c.tooling.command.boilerplate.nodes;

public class BoilerplateKeyValuePair extends BoilerplateTopLevelNode {
    private String value;

    public BoilerplateKeyValuePair(String key, String value) {
        super(key);
        this.value = value;
    }

    public String value() {
        return value;
    }
}
