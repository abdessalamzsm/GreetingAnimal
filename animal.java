class animal{
    public static String animalDefaultGreeting()
    {
        return "Hello!";
    }
    public static String animalCatGreeting()
    {
        return "meow!";
    }
    public static void main(String[] args) {
        String firstArgument = args[0];
        String output = "";
        if(firstArgument.equalsIgnoreCase("Cat"))
        {
            output = animalCatGreeting();
        }
        System.out.println(output);
    }
}