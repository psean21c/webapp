package spring.jdbc;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.apache.commons.dbcp.BasicDataSource;

public class JdbcCorporateEventDao{
//	public class JdbcCorporateEventDao implements CorporateEventDao {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    // JDBC-backed implementations of the methods on the CorporateEventDao follow...
}	