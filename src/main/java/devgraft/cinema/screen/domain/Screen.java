package devgraft.cinema.screen.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "MOVIE_SCREEN")
@Getter
public class Screen {
    @Id
    @Type(SecreenIdType.class)
    ScreenId id;
    @Type(CinemaIdType.class)
    CinemaId cinemaId;
    String name;
}
