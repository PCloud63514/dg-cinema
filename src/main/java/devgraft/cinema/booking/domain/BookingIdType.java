package devgraft.cinema.booking.domain;

import devgraft.cinema.shard.domain.base.DomainIdType;
import org.hibernate.engine.spi.SharedSessionContractImplementor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class BookingIdType extends DomainIdType<BookingId> {
    private BookingIdType() {
        super(BookingId.class, Types.BIGINT);
    }

    @Override
    public BookingId nullSafeGet(final ResultSet rs, final int position, final SharedSessionContractImplementor session, final Object owner) throws SQLException {
        Long v = rs.getLong(position);
        return rs.wasNull() ? null : new BookingId(v);
    }

    @Override
    public void nullSafeSet(final PreparedStatement st, final BookingId value, final int index, final SharedSessionContractImplementor session) throws SQLException {
        if (null == value) {
            st.setNull(index, Types.BIGINT);
        } else {
            st.setLong(index, value.getId());
        }
    }
}
