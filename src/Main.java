/*
V = 17
C13 = 4
Визначити ієрархію музичних композицій.
Записати на диск альбом.
Порахувати тривалість альбому.
Провести перестановку композицій диска на основі приналежності до стилю.
Знайти композицію, що відповідає заданому діапазону довжини треків.

Створити узагальнений клас та не менше 3 класів-нащадків, що описують задану
варіантом (п.2) область знань. Створити клас, що складається з масиву об’єктів, з
яким можна виконати вказані варіантом дії.
*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MusicAlbum album = new MusicAlbum();

        album.addComposition(new PopMusicComposition("Pop Song 1", "Artist 1", 180));
        album.addComposition(new RockMusicComposition("Rock Song 2", "Artist 2", 240));
        album.addComposition(new ClassicMusicComposition("Classic Song 3", "Artist 3", 200));
        album.addComposition(new PopMusicComposition("Pop Song 2", "Artist 4", 230));

        int albumDuration = album.getAlbumDuration();
        System.out.println("Тривалість альбому: " + albumDuration + " секунд");

        System.out.println("Альбом до сортування за стилем: " + album.compositions);
        album.sortByStyle();
        System.out.println("Альбом після сортування за стилем: " + album.compositions);

        int minDuration = 180; // 3 хвилини
        int maxDuration = 200; // 3 хвилини 20 секунд
        ArrayList<MusicComposition> compositionsInRange = album.findCompositionsByDurationRange(minDuration, maxDuration);
        System.out.println("Композиції у заданому діапазоні тривалості: " + compositionsInRange);
    }
}
