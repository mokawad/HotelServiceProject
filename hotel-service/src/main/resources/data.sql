DROP TABLE IF EXISTS HOTELS;

CREATE TABLE HOTELS (
  id INT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  city VARCHAR(250) NOT NULL,
  rating INT NOT NULL,
  description VARCHAR(250) DEFAULT NULL
);

INSERT INTO HOTELS (id, name, city, rating, description) VALUES
  (1, 'Park Hyatt', 'Newyork', 3, null),
  (2, 'Sheratorn', 'Boston', 3, null),
  (3, 'Best Western', 'Maryland', 3, null),
  (4, 'Best Western', 'Bellevue', 3, null),
  (5, 'Mercure', 'Seattle', 3, null),
  (6, 'Hotel Greenpark', 'Dallas', 3, null),
  (7, 'Best Western', 'Austin', 3, null),
  (8, 'Royalton', 'Bali', 3, null),
  (9, 'Trident', 'Portland', 3, null),
  (10, 'Lemon Tree', 'Toronto', 3, null),
  (11, 'Comfotel', 'Mass', 3, null);

