package org.bukkit.craftbukkit.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.minecraft.server.NBTTagCompound;
import net.minecraft.server.NBTTagList;
import org.apache.commons.lang.Validate;
import org.bukkit.Material;
import org.bukkit.configuration.serialization.DelegateDeserialization;
import org.bukkit.craftbukkit.inventory.CraftMetaItem.SerializableMeta;
import org.bukkit.inventory.meta.BookMeta;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.AbstractList;
import net.minecraft.server.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.IChatBaseComponent;
import net.minecraft.server.NBTTagString;
import org.bukkit.craftbukkit.util.CraftChatMessage;

@DelegateDeserialization(SerializableMeta.class)
public class CraftMetaBook extends CraftMetaItem implements BookMeta {

    static final ItemMetaKey BOOK_TITLE = null;

    static final ItemMetaKey BOOK_AUTHOR = null;

    static final ItemMetaKey BOOK_PAGES = null;

    static final ItemMetaKey RESOLVED = null;

    static final ItemMetaKey GENERATION = null;

    static final int MAX_PAGE_LENGTH = 0;

    // TODO: Check me
    static final int MAX_TITLE_LENGTH = 0;

    protected String title = null;

    protected String author = null;

    public List<IChatBaseComponent> pages = null;

    protected Integer generation = null;

    CraftMetaBook(CraftMetaItem meta) {
    }

    CraftMetaBook(NBTTagCompound tag) {
    }

    CraftMetaBook(NBTTagCompound tag, boolean handlePages) {
    }

    CraftMetaBook(Map<String, Object> map) {
    }

    @Override
    void applyToItem(NBTTagCompound itemData) {
    }

    void applyToItem(NBTTagCompound itemData, boolean handlePages) {
    }

    @Override
    boolean isEmpty() {
        return false;
    }

    boolean isBookEmpty() {
        return false;
    }

    @Override
    boolean applicableTo(Material type) {
        return false;
    }

    public boolean hasAuthor() {
        return false;
    }

    public boolean hasTitle() {
        return false;
    }

    public boolean hasPages() {
        return false;
    }

    public boolean hasGeneration() {
        return false;
    }

    public String getTitle() {
        return null;
    }

    public boolean setTitle(final String title) {
        return false;
    }

    public String getAuthor() {
        return null;
    }

    public void setAuthor(final String author) {
    }

    @Override
    public Generation getGeneration() {
        return null;
    }

    @Override
    public void setGeneration(Generation generation) {
    }

    public String getPage(final int page) {
        return null;
    }

    public void setPage(final int page, final String text) {
    }

    public void setPages(final String... pages) {
    }

    public void addPage(final String... pages) {
    }

    public int getPageCount() {
        return 0;
    }

    public List<String> getPages() {
        return null;
    }

    public void setPages(List<String> pages) {
    }

    private boolean isValidPage(int page) {
        return false;
    }

    @Override
    public CraftMetaBook clone() {
        return null;
    }

    @Override
    int applyHash() {
        return 0;
    }

    @Override
    boolean equalsCommon(CraftMetaItem meta) {
        return false;
    }

    @Override
    boolean notUncommon(CraftMetaItem meta) {
        return false;
    }

    @Override
    Builder<String, Object> serialize(Builder<String, Object> builder) {
        return null;
    }
}
