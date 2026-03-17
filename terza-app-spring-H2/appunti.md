1. Spring Boot avvia → carica application.properties
2. JPA rileva entità annotate (@Entity)
3. spring.jpa.hibernate.ddl-auto=update → Hibernate genera DDL
4. Esegue SQL: CREATE TABLE IF NOT EXISTS students (...)
5. ✅ Tabelle pronte all'uso!

# SPRING su progetto studenti e corsi
### Ordini di creazione
1. Costruire Entità 
2. Attrezzare Repositories per permettere la scrittura e la lettura dalle tabelle
3. Sviluppare i services per poter inserire la logica di business


### Query per inserimento dati
```sql
USE spring_web;

-- 1. Elimina dati
DELETE FROM students_course;
DELETE FROM students;
DELETE FROM courses;

-- 2. Reset AUTO_INCREMENT a 1
ALTER TABLE students AUTO_INCREMENT = 1;
ALTER TABLE courses AUTO_INCREMENT = 1;

-- 3. Reinserisci (ID partiranno da 1)
INSERT INTO courses (title, description) VALUES
('Java Programming', 'Corso base di Java per principianti'),
('Spring Boot Framework', 'Sviluppo web con Spring Boot e JPA'),
('Database MySQL', 'Gestione avanzata di database relazionali'),
('RESTful APIs', 'Creazione di API REST con Spring');

INSERT INTO students (first_name, last_name, email) VALUES
('Mario', 'Rossi', 'mario.rossi@email.com'),
('Anna', 'Verdi', 'anna.verdi@email.com'),
('Luca', 'Bianchi', 'luca.bianchi@email.com'),
('Giulia', 'Neri', 'giulia.neri@email.com'),
('Paolo', 'Gialli', 'paolo.gialli@email.com');

INSERT INTO students_course (student_id, course_id) VALUES
(1,1),(1,2),(2,1),(2,3),(3,2),(3,4),(4,3),(5,1),(5,4);
```


### Uso del DTO
I DTO (Data Transfer Object) risolvono la serializzazione ciclica e ottimizzano le API JSON.
​

Crealo in src/main/java/com/dario/webapp/dto/StudentDTO.java (crea cartella dto se manca).

Cos'è un DTO e Perché Serve
DTO è un oggetto "piatto" per trasferire dati tra layer (controller → client), senza logica JPA/Hibernate.
​

Problemi senza DTO:

Cicli bidirezionali: Student ↔ Courses causano JSON infiniti/duplicati.
​

Lazy loading: courses non caricati → LazyInitializationException.

Sovraccarico: Espone campi interni (password, timestamps).

Vantaggi DTO:

JSON pulito, solo campi necessari.

No cicli: controlli cosa serializzare.

Performance: meno query JOIN.

Sicurezza: nasconde dati sensibili.
