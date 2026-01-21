package builder;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Tweet post = Tweet.builder()
                .author("Enrico")
                .content("Boring")
                .hashTags(List.of("Lombok looks interesting", "Hello"))
                .timestamp(LocalDateTime.now())
                .build();

        System.out.println(post);
    }
}
