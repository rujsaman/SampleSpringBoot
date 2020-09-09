DROP TABLE IF EXISTS store cascade;
 
CREATE TABLE store (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  email VARCHAR(250),
  country VARCHAR(250) NOT NULL,
  region VARCHAR(250) NOT NULL
);
 
INSERT INTO store (name, email, country, region) VALUES
  ('Exsgi IN', 'storea@exsgi.com', 'India', 'Ahmedabad'),
  ('Exsgi JA', 'storeb@exsgi.com', 'Japan', 'Tohoku'),
  ('Exsgi UK', 'storec@exsgi.com', 'UK','Scotland');

 DROP TABLE IF EXISTS toy cascade;
 
 CREATE TABLE toy (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  manufacturerName VARCHAR(250) NOT NULL,
  color VARCHAR(250) NOT NULL
 );
 
 INSERT INTO toy (name, manufacturerName, color) VALUES
  ('Barbie', 'Mattel', 'Pink'),
  ('Iron Man', 'Marvel', 'Black'),
  ('Man Of Street', 'DC Comics', 'Blue'),
  ('Dancing Duck', 'DC Comics', 'Blue');

 DROP TABLE IF EXISTS store_toy;
 
  CREATE TABLE store_toy (
  store_toy_id INT AUTO_INCREMENT  PRIMARY KEY,
  store_id INT , 
  foreign key (store_id) references store(id) on delete cascade,
  toy_id INT, foreign key (toy_id) references toy(id) on delete cascade
  );
  
  insert into store_toy(store_id,toy_id)values((select id from store where name='Exsgi IN'),(select id from toy where name='Barbie'));
  insert into store_toy(store_id,toy_id)values((select id from store where name='Exsgi IN'),(select id from toy where name='Iron Man'));
  insert into store_toy(store_id,toy_id)values((select id from store where name='Exsgi JA'),(select id from toy where name='Dancing Duck'));
  insert into store_toy(store_id,toy_id)values((select id from store where name='Exsgi UK'),(select id from toy where name='Barbie'));
  insert into store_toy(store_id,toy_id)values((select id from store where name='Exsgi UK'),(select id from toy where name='Iron Man'));
  insert into store_toy(store_id,toy_id)values((select id from store where name='Exsgi UK'),(select id from toy where name='Dancing Duck'));