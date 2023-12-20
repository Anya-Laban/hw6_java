import java.util.ArrayList;
import java.util.Comparator;
class MusicAlbum {
    private ArrayList<MusicComposition> compositions;
    public MusicAlbum() {
        compositions = new ArrayList<>();
    }
    public void addComposition(MusicComposition composition) {
        compositions.add(composition);
    }
    public  ArrayList<MusicComposition> getCompositions(){
        return compositions;
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
        if (minDuration > maxDuration) {
            int temp = minDuration;
            minDuration = maxDuration;
            maxDuration = temp;
        }

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
