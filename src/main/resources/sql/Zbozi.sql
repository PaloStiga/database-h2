CREATE TABLE ZBOZI (
                          ID BIGINT,
                          EAN VARCHAR(255) NOT NULL,
                          POCET INTEGER NOT NULL,
                          CENA_CELKEM DECIMAL(19,2) NOT NULL,
                          DATUM_CAS TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                          PRIMARY KEY (ID)
);
CREATE SEQUENCE SEQ_ZBOZI START WITH 1 INCREMENT BY 1;