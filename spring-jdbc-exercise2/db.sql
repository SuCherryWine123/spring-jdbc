CREATE TABLE Staff(
	staff_id SERIAL PRIMARY KEY,
	staff_name VARCHAR(100) NOT NULL,
	age INT NOT NULL,
	position VARCHAR(100) NOT NULL
);

CREATE TABLE Role(
	role_id SERIAL PRIMARY KEY,
	staff_id INT NOT NULL,
	role_name VARCHAR(100) NOT NULL,
	FOREIGN KEY(staff_id) REFERENCES Staff(staff_id)
);
