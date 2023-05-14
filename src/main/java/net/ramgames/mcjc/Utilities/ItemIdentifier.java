package net.ramgames.mcjc.Utilities;

public class ItemIdentifier extends Identifier {

    public ItemIdentifier(int id) {
        super(id);
    }

    public int getItemId() {
        return this.id;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof ItemIdentifier item) return this.id == item.id;
        return false;
    }
}
