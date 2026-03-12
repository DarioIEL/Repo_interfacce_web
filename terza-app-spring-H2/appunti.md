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
