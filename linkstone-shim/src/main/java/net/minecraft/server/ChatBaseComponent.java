package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LOverride;
import net.glowstone.linkstone.annotations.Version;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

@LClassfile(version = Version.V1_12_R1)
public abstract class ChatBaseComponent implements IChatBaseComponent {
    @LGenerate
    @LField(version = Version.V1_12_R1, name = "a")
    private List<IChatBaseComponent> siblings = new ArrayList<>();

    @LGenerate
    @LField(version = Version.V1_12_R1, name = "b")
    private ChatModifier modifier = new ChatModifier();

    @LConstructor(version = Version.V1_12_R1)
    public ChatBaseComponent() {}

    @Override
    @LOverride
    public List<IChatBaseComponent> getSiblings() {
        return siblings;
    }

    @Override
    @LOverride
    public IChatBaseComponent addSibling(IChatBaseComponent sibling) {
        siblings.add(sibling);
        return this;
    }

    @Override
    @LOverride
    public IChatBaseComponent addSibling(String text) {
        return addSibling(new ChatComponentText(text));
    }

    @Override
    @LOverride
    public ChatModifier getChatModifier() {
        return modifier;
    }

    @Override
    @LOverride
    public IChatBaseComponent setChatModifier(ChatModifier modifier) {
        this.modifier = modifier;
        return this;
    }

    @Override
    @LOverride
    public String toPlainText() {
        StringBuilder builder = new StringBuilder();
        this.forEach(builder::append);
        return builder.toString();
    }

    @Override
    public Iterator<IChatBaseComponent> iterator() {
        return new Iterator<IChatBaseComponent>() {
            IChatBaseComponent cache = ChatBaseComponent.this;
            Iterator<IChatBaseComponent> siblingIter = siblings.iterator();
            Iterator<IChatBaseComponent> siblingSiblingIter = null;

            @Override
            public boolean hasNext() {
                return cache != null || fetchNext();
            }

            @Override
            public IChatBaseComponent next() {
                if (cache == null) {
                    if (!fetchNext()) {
                        throw new NoSuchElementException();
                    }
                }

                IChatBaseComponent cache = this.cache;
                this.cache = null;
                return cache;
            }

            private boolean fetchNext() {
                while (siblingSiblingIter == null || !siblingSiblingIter.hasNext()) {
                    if (!siblingIter.hasNext()) {
                        return false;
                    }
                    siblingSiblingIter = siblingIter.next().iterator();
                }

                cache = siblingSiblingIter.next();
                return true;
            }
        };
    }
}
