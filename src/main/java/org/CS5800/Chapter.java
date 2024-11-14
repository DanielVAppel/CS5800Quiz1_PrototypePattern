package org.CS5800;

import java.util.Objects;

public class Chapter {
    private String title;

    public Chapter(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chapter chapter = (Chapter) o;
        return Objects.equals(title, chapter.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
