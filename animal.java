class animal{
    public static String animalDefaultGreeting()
    {
        return "Hello!";
    }
    public static void main(String[] args) {
        String output = "";
        output = animalDefaultGreeting();
        System.out.println(output);
    }
}