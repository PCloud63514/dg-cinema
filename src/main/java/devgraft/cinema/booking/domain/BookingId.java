package devgraft.cinema.booking.domain;

import devgraft.cinema.shard.domain.base.DomainId;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class BookingId extends DomainId {
    private final Long id;
}
