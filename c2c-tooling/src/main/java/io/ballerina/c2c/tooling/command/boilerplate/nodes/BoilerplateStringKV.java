package io.ballerina.c2c.tooling.command.boilerplate.nodes;

public class BoilerplateStringKV extends BoilerplateKeyValuePair {

    public BoilerplateStringKV(String key, String value) {
        super(key, value);
    }

    @Override
    public String toString() {
        return this.key() + "=" + "\"" + value() + "\"";
    }
}
