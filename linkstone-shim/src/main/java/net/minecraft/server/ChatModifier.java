package net.minecraft.server;

import net.glowstone.linkstone.annotations.LClassfile;
import net.glowstone.linkstone.annotations.LConstructor;
import net.glowstone.linkstone.annotations.LField;
import net.glowstone.linkstone.annotations.LGenerate;
import net.glowstone.linkstone.annotations.LMethod;
import net.md_5.bungee.api.chat.BaseComponent;

import static net.glowstone.linkstone.annotations.Version.V1_12_R1;

@LClassfile(version = V1_12_R1)
public class ChatModifier {
    @LGenerate
    @LField(version = V1_12_R1, name = "a")
    private ChatModifier parent;

    @LGenerate
    @LField(version = V1_12_R1, name = "b")
    private EnumChatFormat color;

    @LGenerate
    @LField(version = V1_12_R1, name = "c")
    private Boolean bold;

    @LGenerate
    @LField(version = V1_12_R1, name = "d")
    private Boolean italic;

    @LGenerate
    @LField(version = V1_12_R1, name = "e")
    private Boolean underline;

    @LGenerate
    @LField(version = V1_12_R1, name = "f")
    private Boolean strikethrough;

    @LGenerate
    @LField(version = V1_12_R1, name = "g")
    private Boolean random;

    @LGenerate
    @LField(version = V1_12_R1, name = "h")
    private ChatClickable chatClickable;

    @LGenerate
    @LField(version = V1_12_R1, name = "i")
    private ChatHoverable chatHoverable;

    @LGenerate
    @LField(version = V1_12_R1, name = "j")
    private String insertion;

    @LConstructor(version = V1_12_R1)
    public ChatModifier() {}

    @LMethod(version = V1_12_R1)
    public ChatModifier clone() {
        return new ChatModifier()
                .setParent(this.parent)
                .setColor(this.color)
                .setBold(this.bold)
                .setItalic(this.italic)
                .setUnderline(this.underline)
                .setStrikethrough(this.strikethrough)
                .setRandom(this.random)
                .setChatClickable(this.chatClickable)
                .setChatHoverable(this.chatHoverable)
                .setInsertion(this.insertion);
    }

    @LMethod(version = V1_12_R1, name = "o")
    public ChatModifier getParent() {
        return parent;
    }

    @LMethod(version = V1_12_R1)
    public EnumChatFormat getColor() {
        if (color == null) {
            return parent == null ? null : parent.getColor();
        }
        return color;
    }

    @LMethod(version = V1_12_R1)
    public boolean isBold() {
        if (bold == null) {
            return parent == null ? false : parent.isBold();
        }
        return bold;
    }

    @LMethod(version = V1_12_R1)
    public boolean isItalic() {
        if (italic == null) {
            return parent == null ? false : parent.isItalic();
        }
        return italic;
    }

    @LMethod(version = V1_12_R1)
    public boolean isUnderlined() {
        if (underline == null) {
            return parent == null ? false : parent.isUnderlined();
        }
        return underline;
    }

    @LMethod(version = V1_12_R1)
    public boolean isStrikethrough() {
        if (strikethrough == null) {
            return parent == null ? false : parent.isStrikethrough();
        }
        return strikethrough;
    }

    @LMethod(version = V1_12_R1)
    public boolean isRandom() {
        if (random == null) {
            return parent == null ? false : parent.isRandom();
        }
        return random;
    }

    @LMethod(version = V1_12_R1, name = "h")
    public ChatClickable getChatClickable() {
        if (chatClickable == null) {
            return parent == null ? null : parent.getChatClickable();
        }
        return chatClickable;
    }

    @LMethod(version = V1_12_R1, name = "i")
    public ChatHoverable getChatHoverable() {
        if (chatHoverable == null) {
            return parent == null ? null : parent.getChatHoverable();
        }
        return chatHoverable;
    }

    @LMethod(version = V1_12_R1, name = "j")
    public String getInsertion() {
        if (insertion == null) {
            return parent == null ? null : parent.getInsertion();
        }
        return insertion;
    }

    @LMethod(version = V1_12_R1, name = "setChatModifier")
    public ChatModifier setParent(ChatModifier parent) {
        this.parent = parent;
        return this;
    }

    @LMethod(version = V1_12_R1)
    public ChatModifier setColor(EnumChatFormat color) {
        this.color = color;
        return this;
    }

    @LMethod(version = V1_12_R1)
    public ChatModifier setBold(Boolean bold) {
        this.bold = bold;
        return this;
    }

    @LMethod(version = V1_12_R1)
    public ChatModifier setItalic(Boolean italic) {
        this.italic = italic;
        return this;
    }

    @LMethod(version = V1_12_R1)
    public ChatModifier setUnderline(Boolean underline) {
        this.underline = underline;
        return this;
    }

    @LMethod(version = V1_12_R1)
    public ChatModifier setStrikethrough(Boolean strikethrough) {
        this.strikethrough = strikethrough;
        return this;
    }

    @LMethod(version = V1_12_R1)
    public ChatModifier setRandom(Boolean random) {
        this.random = random;
        return this;
    }

    @LMethod(version = V1_12_R1)
    public ChatModifier setChatClickable(ChatClickable chatClickable) {
        this.chatClickable = chatClickable;
        return this;
    }

    @LMethod(version = V1_12_R1)
    public ChatModifier setChatHoverable(ChatHoverable chatHoverable) {
        this.chatHoverable = chatHoverable;
        return this;
    }

    @LMethod(version = V1_12_R1)
    public ChatModifier setInsertion(String insertion) {
        this.insertion = insertion;
        return this;
    }

    /**
     * Apply the properties of this style to a BungeeApi {@link BaseComponent}
     *
     * @param component Apply style to this component
     */
    public void apply(BaseComponent component) {
        component.setColor(EnumChatFormat.toGlowstone(getColor()));
        component.setBold(isBold());
        component.setItalic(isItalic());
        component.setUnderlined(isUnderlined());
        component.setStrikethrough(isStrikethrough());
        component.setObfuscated(isRandom());
        component.setClickEvent(ChatClickable.toGlowstone(getChatClickable()));
        component.setHoverEvent(ChatHoverable.toGlowstone(getChatHoverable()));
        component.setInsertion(getInsertion());
    }
}
