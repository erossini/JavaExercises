static void main() {
    System.out.println("Hello!");

    List<Integer> ages = Arrays.asList(20, 25, 30);

    // current Java is doing the boxing for us
    Integer i = new Integer(20);
    int j = i.intValue();
    // so this is equal to
    // Integer i = 20;

    int totalAge = ages.stream()
            .mapToInt(Integer::intValue)
            .sum();

    System.out.printf("Total age: %d%n", totalAge);

    // print out the number of languages more than four characters
    final long NUMBEROFCHARS = 4L;

    List<String> langs = Arrays.asList("Java", "C#", "Python", "JavaScript", "Rush", "C++", "Julia");

    long count = langs.stream().filter(n -> n.length() > NUMBEROFCHARS).count();
    System.out.println("Total languages: " + count);
}