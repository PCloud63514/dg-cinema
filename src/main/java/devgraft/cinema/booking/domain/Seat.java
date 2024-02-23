package devgraft.cinema.booking.domain;

import devgraft.cinema.screen.domain.ScreenId;
import devgraft.cinema.screen.domain.SecreenIdType;
import jakarta.persistence.Id;
import org.hibernate.annotations.Type;

public class Seat {
    @Id
    @Type(SeatIdType.class)
    SeatId id;
    @Type(SecreenIdType.class)
    ScreenId screenId;
    String row;
    Long col;
    boolean isAvailable;
}
