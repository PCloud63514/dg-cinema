package devgraft.cinema.screen.domain;

import devgraft.cinema.shard.domain.base.DomainId;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class CinemaId extends DomainId {
    private final Long id;
}
