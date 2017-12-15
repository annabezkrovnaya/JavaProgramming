package ua.org.oa.annabezkrovnaya.practice3;

public class App {

    public static void main(String[] args) {
        GenericStorage<Integer, Movie> movieStorage = new GenericStorageImpl<>();
        System.out.println(movieStorage.create(new Movie("Бегущий по лезвию 2049", "фэнтези", "США", "16+", "3D")));
        System.out.println(movieStorage.read(1).toString());
        System.out.println(movieStorage.update(1, new Movie("Бегущий по лезвию 2049", "Фэнтези/Детектив", "США", "18+", "3D")));
        System.out.println(movieStorage.delete(1));
        System.out.println(movieStorage.read(1));
    }
}
