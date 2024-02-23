package devgraft.cinema.booking.domain;

import java.time.LocalDateTime;

public class Movie {
    Long id;
    String title;
    String description;
    String bannerUrl;
    LocalDateTime releaseAt;
    Long duration;
}
