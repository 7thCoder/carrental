-- Create a table named car
CREATE TABLE car (
  id INT AUTO_INCREMENT PRIMARY KEY,
  brand VARCHAR(50) NOT NULL, 
  yer VARCHAR(4) NOT NULL, 
  price VARCHAR(10) NOT NULL 
);

CREATE TABLE users (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  adress VARCHAR(255) NOT NULL,
  phoneNumber VARCHAR(255) NOT NULL
);
