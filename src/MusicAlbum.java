import java.util.ArrayList;
import java.util.Comparator;
class MusicAlbum {
    public ArrayList<MusicComposition> compositions;
    public MusicAlbum() {
        compositions = new ArrayList<>();
    }
    public void addComposition(MusicComposition composition) {
        compositions.add(composition);
    }
    public int getAlbumDuration() {
        int totalDuration = 0;
        for (MusicComposition composition : compositions) {
            totalDuration += composition.getDuration();
        }
        return totalDuration;
    }
    public void sortByStyle() {
        compositions.sort(Comparator.comparing(MusicComposition::getStyle));
    }
    public ArrayList<MusicComposition> findCompositionsByDurationRange(int minDuration, int maxDuration) {
        ArrayList<MusicComposition> foundCompositions = new ArrayList<>();
        for (MusicComposition composition : compositions) {
            int duration = composition.getDuration();
            if (duration >= minDuration && duration <= maxDuration) {
                foundCompositions.add(composition);
            }
        }
        return foundCompositions;
    }
}
