package cz.stiga.ukol.dbh2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;

@Configuration
public class DbLoaderConfig {

    @Bean
    public CommandLineRunner loadData(DataSource dataSource) {
        return args -> {
            Resource resource = new ClassPathResource("sql/Zbozi.sql");
            ScriptUtils.executeSqlScript(dataSource.getConnection(), new EncodedResource(resource, "UTF-8"));
            dataSource.getConnection().commit();
        };
    }

}
