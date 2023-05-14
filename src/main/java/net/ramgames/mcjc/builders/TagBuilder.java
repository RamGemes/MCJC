package net.ramgames.mcjc.builders;

import java.util.ArrayList;
import java.util.List;

public class TagBuilder {

    protected final List<TagBuilder> tags = new ArrayList<>();

    boolean replace;



    private TagBuilder() {

    }

    public static TagBuilder newTag() {
        return new TagBuilder();
    }



    public void publish() {
        tags.add(this);
    }




}


