package devgraft.cinema.booking.domain;

import java.util.List;

public class Screen {
    Long id;
    Long cinemaId;
    String name;
    List<Seat> seats;
}
