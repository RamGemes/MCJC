package net.ramgames.mcjc.api;

import net.ramgames.mcjc.Utilities.Argumental;
import net.ramgames.mcjc.Utilities.Argument;
import net.ramgames.mcjc.Utilities.ArgumentType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FunctionManager {

    final List<Argumental> uncompiledLines = new ArrayList<>();
    private void add(String command, Object... arguments) {
        List<Argument> listArguments = new ArrayList<>();
        for(Object object: arguments) {
            if(object instanceof Integer) {
                listArguments.add(new Argument(ArgumentType.INT, object));
            }
            if(object instanceof Byte) {
                listArguments.add(new Argument(ArgumentType.BYTE, object));
            }
            if(object instanceof Double) {
                listArguments.add(new Argument(ArgumentType.DOUBLE, object));
            }
            if(object instanceof Float) {
                listArguments.add(new Argument(ArgumentType.FLOAT, object));
            }
            if(object instanceof Long) {
                listArguments.add(new Argument(ArgumentType.LONG, object));
            }
            if(object instanceof Short) {
                listArguments.add(new Argument(ArgumentType.SHORT, object));
            }
        }
        Argument[] finalArguments = new Argument[listArguments.size()];
        for(var i = 0; i < listArguments.size(); i++) finalArguments[i] = listArguments.get(i);
        uncompiledLines.add(new Argumental(command, finalArguments));
    }
    private void add(String command) {
        uncompiledLines.add(new Argumental(command, new Argument[]{}));
    }
    public final class Time {
        int getWorldTime() {
            add("Time.Query(");
            return 0;
        }

        int getDayNumber() {
            add("Time.Day(");
            return 0;
        }

        int getPlayTime() {
            add("Time.PlayTime(");
            return 0;
        }

        void incrementTime(int value) {
            add("Time.Add(", value);
        }

        void setWorldTime(int value) {
            add("Time.Set(", value);
        }

    }
}
