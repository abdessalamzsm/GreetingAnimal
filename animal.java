class animal{
    public static String animalDefaultGreeting()
    {
        return "Hello!";
    }
    public static String animalCatGreeting()
    {
        return "meow!";
    }
        public static String animalBirdGreeting()
    {
        return "tweet";
    }

    public static void main(String[] args) {
        String firstArgument = args[0];
        String output = "";
        if(firstArgument.equalsIgnoreCase("Cat"))
        {
            output = animalCatGreeting();
        }
        else if(firstArgument.equalsIgnoreCase("Bird"))
        {
            output = animalBirdGreeting();
        }
        else
            output = animalDefaultGreeting();
        System.out.println(output);
    }
}