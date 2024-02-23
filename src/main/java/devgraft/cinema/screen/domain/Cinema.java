package devgraft.cinema.screen.domain;

import devgraft.cinema.shard.domain.base.DomainEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "CINEMA")
@Getter
public class Cinema extends DomainEntity<Cinema, CinemaId> {
    @Id
    @Type(CinemaIdType.class)
    private CinemaId id;
    private String name;
}
