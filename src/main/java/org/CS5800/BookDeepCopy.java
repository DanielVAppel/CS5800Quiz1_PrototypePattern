package org.CS5800;

import java.util.ArrayList;
import java.util.List;

public class BookDeepCopy implements Cloneable {
    private String title;
    private final List<Chapter> chapters;

    public BookDeepCopy(String title, List<Chapter> chapters) {
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
    public BookDeepCopy clone() throws CloneNotSupportedException {
        List<Chapter> clonedChapters = new ArrayList<>();
        for (Chapter chapter : this.chapters) {
            clonedChapters.add(new Chapter(chapter.getTitle()));
        }
        return new BookDeepCopy(this.title, clonedChapters);
    }

    @Override
    public String toString() {
        return "BookDeepCopy{" +
                "title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
