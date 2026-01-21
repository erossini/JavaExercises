import lombokStart.Author;

void main() {
    List<Author> authors = new ArrayList<>();
    authors.add(new Author(1, "First", ""));
    authors.add(new Author(2, "Second", ""));

    for (Author a: authors) {
        System.out.println(a.getName());
    }
}
