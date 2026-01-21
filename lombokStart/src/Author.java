/*
How to add lombok in IntelliJ

- Open IntelliJ IDEA.
- Navigate to File → Settings → Plugins.
- Search for Lombok in the Marketplace tab.
- Click Install on the "Lombok Plugin" by Michail Plushnikov.
- Restart IntelliJ IDEA after installation.

Then, you need to go to the Preferences | Build, Execution, Deployment | Compiler | Annotation Processors and make sure of the following:

- Enable annotation processing box is checked
- Obtain processors from project classpath option is selected

 */

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Author {
    private int id;
    private String name;

    private String surname;
    private String email;

    private final String birthPlace = "Somewhere";

    /**
     * This is the constructor of the Author class
     *
     * @param id This is the author identifier
     * @param name This is the first name of the author
     * @param surname This is the last name of the author
     */
    public Author(
            @NonNull int id,
            @NonNull String name,
            String surname
    ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
