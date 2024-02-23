package devgraft.cinema.member.domain;

import devgraft.cinema.shard.domain.base.DomainId;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MemberId extends DomainId {
    private final Long id;
}
