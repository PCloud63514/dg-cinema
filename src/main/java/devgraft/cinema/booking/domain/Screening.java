package devgraft.cinema.booking.domain;

import java.time.LocalDateTime;

public class Screening {
    Long id;
    Long movieId;
    Long screenId;
    LocalDateTime startAt;
    LocalDateTime endAt; // startAt + movie.duration
    Long price;
}
