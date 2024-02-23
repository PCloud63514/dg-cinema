package devgraft.cinema.booking.domain;

import java.time.LocalDateTime;

public class Booking {
    // cart 느낌으로
    // 아이템으로
    Long id;
    Long memberId;
    Long seatId;
    String status;
    LocalDateTime reservedAt;
    LocalDateTime cancelledAt;
    LocalDateTime paidAt;
}
