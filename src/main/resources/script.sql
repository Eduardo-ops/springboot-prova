CREATE TABLE Accounting (
    code LONG(20) primary key auto_increment,
    type VARCHAR(30),
    description VARCHAR(30),
    date DATE,
    value DOUBLE,
    Preofit DOUBLE
);

CREATE TABLE Autiting(
    identifier SERIAL NOT NULL,
    register_code NUMERIC(20) NOT NULL, 
    FOREIGN KEY (register_code) REFERENCES Accounting(code)
    DATETIME TIMESTAMP NOT NULL,
    CONSTRAINT auditing_pk PRIMARY KEY (IDENTIFIER)
);

