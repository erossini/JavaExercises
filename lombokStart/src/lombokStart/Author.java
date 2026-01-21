package lombokStart;/*
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
@EqualsAndHashCode
@ToString
public class Author {
    /**
     * lombokStart.Author identification
     *
     * @param id New value for the author identification
     * @return The current value of this author identification
     */
    @Getter @Setter private int id;

    /**
     * lombokStart.Author's name
     *
     * @param name The name of the author
     * @return The current value of this author name
     */
    @Getter @Setter private String name;

    private String surname;
    private String email;

    private final String birthPlace = "Somewhere";

    /**
     * This is the constructor of the lombokStart.Author class
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
