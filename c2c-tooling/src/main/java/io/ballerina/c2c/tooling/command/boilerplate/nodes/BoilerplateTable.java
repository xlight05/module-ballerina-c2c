package io.ballerina.c2c.tooling.command.boilerplate.nodes;

public class BoilerplateTable extends BoilerplateTopLevelNode {

    public BoilerplateTable(String key) {
        super(key);
    }

    @Override
    public String toString() {
        return "[" + this.key() + "]";
    }
}
