package basics;

import lombok.*;

@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Getter
@Setter
@ToString(exclude = "password")
public class UserAnnotation {
    private final Long id;
    private final String name;
    private String password;

    // this is a default constructor
    //{
    //    id = 12L;
    //    name = "Betty";
    //}
}