public class Main {

    public static void main(String[] args) {
        DogM dogMut = new DogM();
        dogMut.setName("Maylo");
        dogMut.setAge(12);

        System.out.println(dogMut);
         dogMut.name = "Vaska";
         dogMut.age = 17;
        System.out.println(dogMut);

    }
}
