CREATE TABLE BS_ROLE (
    ROLE_ID INT NOT NULL AUTO_INCREMENT,
    ROLE_NAME VARCHAR(50) NOT NULL UNIQUE,
    DESCRIPTION VARCHAR(200),
    CREATED_AT DATETIME DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (ROLE_ID)
);

CREATE TABLE BS_USER_ROLE (
    USER_ROLE_ID INT AUTO_INCREMENT,
    USER_ID VARCHAR(50),
    ROLE_ID INT,
    CREATED_AT DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (USER_ROLE_ID),
    FOREIGN KEY (USER_ID) REFERENCES BS_USER(USER_ID) ON DELETE CASCADE,
    FOREIGN KEY (ROLE_ID) REFERENCES BS_ROLE(ROLE_ID) ON DELETE CASCADE,
    UNIQUE KEY UK_USER_ROLE (USER_ID, ROLE_ID)
);

CREATE TABLE BS_MENU (
    MENU_ID INT AUTO_INCREMENT PRIMARY KEY,
    MENU_NAME VARCHAR(100) NOT NULL,
    MENU_URL VARCHAR(200),
    PARENT_ID INT,
    MENU_ORDER INT DEFAULT 0,
    MENU_ICON VARCHAR(50),
    MENU_TYPE CHAR(1) COMMENT 'G: Group, M: Menu, S: Sub-menu',
    ENABLED BOOLEAN DEFAULT TRUE,
    CREATED_AT DATETIME DEFAULT CURRENT_TIMESTAMP,
    UPDATED_AT DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (PARENT_ID) REFERENCES BS_MENU(MENU_ID) ON DELETE CASCADE
);

CREATE TABLE BS_ROLE_MENU (
    ROLE_MENU_ID INT AUTO_INCREMENT,
    ROLE_ID INT,
    MENU_ID INT,
    CREATE_PERM BOOLEAN DEFAULT FALSE,
    READ_PERM BOOLEAN DEFAULT TRUE,
    UPDATE_PERM BOOLEAN DEFAULT FALSE,
    DELETE_PERM BOOLEAN DEFAULT FALSE,
    CREATED_AT DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (ROLE_MENU_ID),
    FOREIGN KEY (ROLE_ID) REFERENCES BS_ROLE(ROLE_ID) ON DELETE CASCADE,
    FOREIGN KEY (MENU_ID) REFERENCES BS_MENU(MENU_ID) ON DELETE CASCADE,
    UNIQUE KEY UK_ROLE_MENU (ROLE_ID, MENU_ID)
);
