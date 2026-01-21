package basics;

import lombok.Value;

// Generate final fields, getters, no setters, toString, EqualsAndHashCode,
// AllArgsConstructor

// This creates an immutable object
@Value
public class Point {
    int x;
    int y;
}
