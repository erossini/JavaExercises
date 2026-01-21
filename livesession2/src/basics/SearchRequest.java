package basics;

import lombok.*;

// Mutable DTO -> Data Transfer Objects
@RequiredArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class SearchRequest {
    private String query;
    private int page;

    // generate getters, setters, toString, Equals and HashCode, Require args constructor
}
