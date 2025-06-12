BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "AtencionMedica" (
	"id"	INTEGER,
	"cita_medica_id"	INTEGER NOT NULL,
	"sintomas"	TEXT,
	"diagnostico"	TEXT,
	"receta"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("cita_medica_id") REFERENCES "CitaMedica"("id")
);
CREATE TABLE IF NOT EXISTS "CitaMedica" (
	"id"	INTEGER,
	"paciente_id"	INTEGER NOT NULL,
	"medico_id"	INTEGER NOT NULL,
	"descripcion"	TEXT,
	"turno_id"	INTEGER,
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("medico_id") REFERENCES "Medico"("id"),
	FOREIGN KEY("paciente_id") REFERENCES "Paciente"("id"),
	FOREIGN KEY("turno_id") REFERENCES "Turno"("id")
);
CREATE TABLE IF NOT EXISTS "Medico" (
	"id"	INTEGER,
	"especialidad"	TEXT,
	PRIMARY KEY("id"),
	FOREIGN KEY("id") REFERENCES "Persona"("id")
);
CREATE TABLE IF NOT EXISTS "Paciente" (
	"id"	INTEGER,
	"correo"	TEXT,
	PRIMARY KEY("id"),
	FOREIGN KEY("id") REFERENCES "Persona"("id")
);
CREATE TABLE IF NOT EXISTS "Persona" (
	"id"	INTEGER,
	"cedula"	INTEGER NOT NULL,
	"edad"	INTEGER,
	"nombre"	TEXT NOT NULL,
	"apellido"	TEXT NOT NULL,
	"telefono"	INTEGER,
	"genero"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "Turno" (
	"id"	INTEGER,
	"fecha"	TEXT,
	"hora"	TEXT,
	"minuto"	TEXT,
	PRIMARY KEY("id" AUTOINCREMENT)
);
INSERT INTO "AtencionMedica" VALUES (1,1,'Ninguno, chequeo de rutina','Paciente sano','Vitaminas');
INSERT INTO "AtencionMedica" VALUES (2,2,'Fiebre alta, tos, dolor de cabeza','Resfriado comun','Paracetamol, jarabe para la tos');
INSERT INTO "AtencionMedica" VALUES (3,3,'Manchas rojas en la piel, picazon','Dermatitis por contacto','Crema topica de hidrocortisona');
INSERT INTO "AtencionMedica" VALUES (4,4,'Fatiga, dificultad para respirar','Anemia leve','Suplementos de hierro');
INSERT INTO "AtencionMedica" VALUES (5,5,'Sin sintomas, control de vacunas','Control al dia','Proxima vacuna en 6 meses');
INSERT INTO "CitaMedica" VALUES (1,4,1,'Chequeo general',1);
INSERT INTO "CitaMedica" VALUES (2,5,2,'Dolor de garganta y fiebre',2);
INSERT INTO "CitaMedica" VALUES (3,6,3,'Consulta por erupcion cutanea',3);
INSERT INTO "CitaMedica" VALUES (4,7,1,'Revision de resultados de analisis',4);
INSERT INTO "CitaMedica" VALUES (5,8,2,'Vacunacion de rutina',5);
INSERT INTO "Medico" VALUES (1,'Cardiologia');
INSERT INTO "Medico" VALUES (2,'Pediatria');
INSERT INTO "Medico" VALUES (3,'Dermatologia');
INSERT INTO "Paciente" VALUES (4,'ana.diaz@example.com');
INSERT INTO "Paciente" VALUES (5,'pedro.ruiz@example.com');
INSERT INTO "Paciente" VALUES (6,'laura.castro@example.com');
INSERT INTO "Paciente" VALUES (7,'miguel.sanchez@example.com');
INSERT INTO "Paciente" VALUES (8,'sofia.ramirez@example.com');
INSERT INTO "Paciente" VALUES (9,'luis.torres@example.com');
INSERT INTO "Paciente" VALUES (10,'elena.vargas@example.com');
INSERT INTO "Paciente" VALUES (11,'javier.morales@example.com');
INSERT INTO "Paciente" VALUES (12,'valeria.herrera@example.com');
INSERT INTO "Paciente" VALUES (13,'diego.ortiz@example.com');
INSERT INTO "Persona" VALUES (1,1001,45,'Juan','Perez',987654321,'Masculino');
INSERT INTO "Persona" VALUES (2,1002,50,'Maria','Gomez',987654322,'Femenino');
INSERT INTO "Persona" VALUES (3,1003,38,'Carlos','Lopez',987654323,'Masculino');
INSERT INTO "Persona" VALUES (4,2001,30,'Ana','Diaz',991122334,'Femenino');
INSERT INTO "Persona" VALUES (5,2002,25,'Pedro','Ruiz',992233445,'Masculino');
INSERT INTO "Persona" VALUES (6,2003,40,'Laura','Castro',993344556,'Femenino');
INSERT INTO "Persona" VALUES (7,2004,55,'Miguel','Sanchez',994455667,'Masculino');
INSERT INTO "Persona" VALUES (8,2005,33,'Sofia','Ramirez',995566778,'Femenino');
INSERT INTO "Persona" VALUES (9,2006,28,'Luis','Torres',996677889,'Masculino');
INSERT INTO "Persona" VALUES (10,2007,48,'Elena','Vargas',997788990,'Femenino');
INSERT INTO "Persona" VALUES (11,2008,60,'Javier','Morales',998899001,'Masculino');
INSERT INTO "Persona" VALUES (12,2009,22,'Valeria','Herrera',999900112,'Femenino');
INSERT INTO "Persona" VALUES (13,2010,37,'Diego','Ortiz',990011223,'Masculino');
INSERT INTO "Turno" VALUES (1,'2025-06-15','09','00');
INSERT INTO "Turno" VALUES (2,'2025-06-15','10','30');
INSERT INTO "Turno" VALUES (3,'2025-06-16','14','00');
INSERT INTO "Turno" VALUES (4,'2025-06-16','15','45');
INSERT INTO "Turno" VALUES (5,'2025-06-17','11','15');
COMMIT;
