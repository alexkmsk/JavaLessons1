public class Main {

    public static void main(String[] args) {
        //Мутабельная собака
        DogM dogMut = new DogM();
        dogMut.setName("Maylo");
        dogMut.setAge(12);

        System.out.println(dogMut);
         dogMut.name = "Vaska";
         dogMut.age = 17;
        System.out.println(dogMut);

        //Иммутабельная собака
        DogI dogImm = new DogI();
        dogImm.setName("Bobik");
        dogImm.setAge(3);
        System.out.println(dogImm);
        dogImm.name = "Ne Bobik";
        System.out.println(dogImm);

    }
}
