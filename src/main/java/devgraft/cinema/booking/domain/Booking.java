package devgraft.cinema.booking.domain;

import devgraft.cinema.member.domain.MemberId;
import devgraft.cinema.member.domain.MemberIdType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.Type;

import java.time.LocalDateTime;

public class Booking {
    @Type(BookingIdType.class)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BookingId id;
    @Type(MemberIdType.class)
    @Column(name = "member_id", nullable = false)
    private MemberId memberId;
    @Column(name = "reserved_at")
    private LocalDateTime reservedAt;
    @Column(name = "paid_at")
    private LocalDateTime paidAt;
    @Column(name = "cancelled_at")
    private LocalDateTime cancelledAt;
}
