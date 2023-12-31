// Узагальнений клас для музичних композицій
abstract class MusicComposition {
    private String title;
    private String artist;
    private int duration;
    private String style;

    public MusicComposition(String title, String artist, int duration, String style) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.style = style;
    }

    public int getDuration() {
        return duration;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return title + " by " + artist + " (" + duration + " sec)";
    }
}
