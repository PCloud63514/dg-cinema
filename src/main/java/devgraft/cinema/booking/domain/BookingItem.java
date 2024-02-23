package devgraft.cinema.booking.domain;

import devgraft.cinema.shard.domain.base.DomainEntity;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import org.hibernate.annotations.Type;

@Getter
public class BookingItem extends DomainEntity<BookingItem, BookingItemId> {
    public enum BookingItemStatus {RESERVED, PAID, CANCELLED}
    @Type(BookingItemIdType.class)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BookingItemId id;
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private BookingItemStatus status;
}
