package net.ramgames.mcjc.api;

public record Position(double x, double y, double z) {

    public int getIntX() {
        return (int) x;
    }

    public int getIntY() {
        return (int) y;
    }

    public int getIntZ() {
        return (int) z;
    }
}
