package devgraft.cinema.screen.domain;

import devgraft.cinema.shard.domain.base.DomainIdType;
import org.hibernate.engine.spi.SharedSessionContractImplementor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class SecreenIdType extends DomainIdType<ScreenId> {
    protected SecreenIdType() {
        super(ScreenId.class, Types.BIGINT);
    }

    @Override
    public ScreenId nullSafeGet(final ResultSet rs, final int position, final SharedSessionContractImplementor session, final Object owner) throws SQLException {
        Long v = rs.getLong(position);
        return rs.wasNull() ? null : new ScreenId(v);
    }

    @Override
    public void nullSafeSet(final PreparedStatement st, final ScreenId value, final int index, final SharedSessionContractImplementor session) throws SQLException {
        if (null == value) {
            st.setNull(index, Types.BIGINT);
        } else {
            st.setLong(index, value.getId());
        }
    }
}
