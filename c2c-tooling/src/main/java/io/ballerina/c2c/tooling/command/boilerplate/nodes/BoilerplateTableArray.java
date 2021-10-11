package io.ballerina.c2c.tooling.command.boilerplate.nodes;

public class BoilerplateTableArray extends BoilerplateTopLevelNode {

    public BoilerplateTableArray(String key) {
        super(key);
    }

    @Override
    public String toString() {
        return "[[" + this.key() + "]]";
    }
}
