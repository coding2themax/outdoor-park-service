# outdoor-park-service

### Schema

CREATE TABLE customer (id SERIAL PRIMARY KEY, first_name VARCHAR(255), last_name VARCHAR(255));
CREATE TABLE park (parkID VARCHAR(255) PRIMARY KEY, url VARCHAR(255), fullName VARCHAR(255), parkCode VARCHAR(255),
description VARCHAR(255), latitude VARCHAR(255), longitude VARCHAR(255)

INSERT INTO park (parkID, url, fullName, parkCode, description, latitude, longitude) VALUES (  
 '869BAD2B-C46F-4FEB-891B-EBA119B64B48',
'https://www.nps.gov/buov/index.htm',  
 'Butterfield Overland National Historic Trail',
'buov',
'In 1857, businessman and transportation entrepreneur John Butterfield was awarded a contract to establish an overland mail route between the eastern United States and growing populations in the Far West. What became known as the Butterfield Overland Trail made an arcing sweep across the southern rim of the country. Stagecoaches left twice a week carrying passengers, freight, and mail.',
'32.2768237589',
'-106.796583304',
);
INSERT INTO park (parkID, url, fullName, parkCode, description, latitude, longitude) VALUES (  
 '869BAD2B-C46F-4FEB-891B-EBA119B64B48',
'https://www.nps.gov/buov/index.htm',  
 'Canyon de Chelly National Monument',
'cach',
'For nearly 5,000 years, people have lived in these canyons - longer than anyone has lived uninterrupted anywhere ' ,
'36.14319567',
'-109.3388303'
);
