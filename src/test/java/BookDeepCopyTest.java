import org.CS5800.BookDeepCopy;
import org.CS5800.Chapter;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BookDeepCopyTest {

    @Test
    void testDeepCopyCloningBehavior() throws CloneNotSupportedException {
        // Create original book with deep copy
        List<Chapter> chapters = new ArrayList<>();
        chapters.add(new Chapter("Original Chapter 1"));
        chapters.add(new Chapter("Original Chapter 2"));

        BookDeepCopy originalBook = new BookDeepCopy("Original Book", chapters);

        // Clone the original book using deep copy
        BookDeepCopy clonedBook = originalBook.clone();

        // Modify chapters in the original book
        originalBook.getChapters().get(0).setTitle("Modified Chapter 1");

        // Output both books to observe changes
        System.out.println("Original Book: " + originalBook);
        System.out.println("Cloned Book (Deep Copy): " + clonedBook);

        // Assertions
        assertEquals("Modified Chapter 1", originalBook.getChapters().get(0).getTitle());
        assertEquals("Original Chapter 1", clonedBook.getChapters().get(0).getTitle(),
                "Cloned book should not reflect changes in original book's chapters due to deep copy.");
    }
}
