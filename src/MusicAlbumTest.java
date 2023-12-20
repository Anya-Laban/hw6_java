import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class MusicAlbumTest {
    @Test
    public void testGetAlbumDuration() {
        MusicAlbum album = new MusicAlbum();
        album.addComposition(new PopMusicComposition("Pop Song 1", "Artist 1", 180));
        album.addComposition(new RockMusicComposition("Rock Song 2", "Artist 2", 240));
        album.addComposition(new ClassicMusicComposition("Classic Song 3", "Artist 3", 200));
        album.addComposition(new PopMusicComposition("Pop Song 2", "Artist 4", 230));

        int expectedDuration = 850;
        assertEquals(expectedDuration, album.getAlbumDuration());
    }
    @Test
    public void testSortByStyle() {
        MusicAlbum album = new MusicAlbum();
        album.addComposition(new PopMusicComposition("Pop Song 1", "Artist 1", 180));
        album.addComposition(new RockMusicComposition("Rock Song 2", "Artist 2", 240));
        album.addComposition(new ClassicMusicComposition("Classic Song 3", "Artist 3", 200));
        album.addComposition(new PopMusicComposition("Pop Song 2", "Artist 4", 230));

        album.sortByStyle();
        //  пісні повинні бути відсортовані за стилем  в такому порядку Classic, Pop , Rock
        ArrayList<MusicComposition> compositions = album.getCompositions();
        assertEquals("Classic", compositions.get(0).getStyle());
        assertEquals("Pop", compositions.get(1).getStyle());
        assertEquals("Pop", compositions.get(2).getStyle());
        assertEquals("Rock", compositions.get(3).getStyle());
    }

    @Test
    public void testFindCompositionsByDurationRange() {
        MusicAlbum album = new MusicAlbum();
        album.addComposition(new PopMusicComposition("Pop Song 1", "Artist 1", 180));
        album.addComposition(new RockMusicComposition("Rock Song 2", "Artist 2", 240));
        album.addComposition(new ClassicMusicComposition("Classic Song 3", "Artist 3", 200));
        album.addComposition(new PopMusicComposition("Pop Song 2", "Artist 4", 230));

        int minDuration = 180;
        int maxDuration = 200;
        ArrayList<MusicComposition> compositionsInRange = album.findCompositionsByDurationRange(minDuration, maxDuration);

        assertEquals(2, compositionsInRange.size());
    }
}