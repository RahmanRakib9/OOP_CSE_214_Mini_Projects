class Main {
    public static void main(String args[]) {
        int id = 6191;
        int age = 21;
        int temp;

        System.out.println(age);
        System.out.println(id);

        temp = id;
        id = age;
        age = temp;

        System.out.println(age);
        System.out.println(id);
    }
}
