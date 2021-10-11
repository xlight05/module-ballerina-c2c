package io.ballerina.c2c.tooling.command.boilerplate.nodes;

public class BoilerplateBooleanKV extends BoilerplateKeyValuePair {

    public BoilerplateBooleanKV(String key, String value) {
        super(key, value);
    }

    @Override
    public String toString() {
        return this.key() + "=" +  value();
    }
}
