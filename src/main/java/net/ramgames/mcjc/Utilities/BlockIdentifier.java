package net.ramgames.mcjc.Utilities;

public class BlockIdentifier extends ItemIdentifier {

    final int blockId;
    public BlockIdentifier(int itemId, int blockId) {
        super(itemId);
        this.blockId = blockId;
    }

    public int getBlockId() {
        return this.blockId;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof BlockIdentifier block) return this.blockId ==block.blockId;
        return false;
    }
}
