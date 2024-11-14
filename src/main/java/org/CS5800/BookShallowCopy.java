package org.CS5800;

import java.util.ArrayList;
import java.util.List;

public class BookShallowCopy implements Cloneable {
    private String title;
    private final List<Chapter> chapters;

    public BookShallowCopy(String title, List<Chapter> chapters) {
        this.title = title;
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    @Override
    public BookShallowCopy clone() throws CloneNotSupportedException {
        return (BookShallowCopy) super.clone();
    }

    @Override
    public String toString() {
        return "BookShallowCopy{" +
                "title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
