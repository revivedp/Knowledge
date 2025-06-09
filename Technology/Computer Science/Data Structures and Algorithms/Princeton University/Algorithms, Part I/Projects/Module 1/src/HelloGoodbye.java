public class HelloGoodbye {
    public static void main(String[] args) {

        String name_one = args[0];
        String name_two = args[1];

        String hello = String.format("Hello %s and %s.", name_one, name_two);
        String goodbye = String.format("Goodbye %s and %s.", name_two, name_one);

        System.out.println(hello);
        System.out.println(goodbye);



    }
}
