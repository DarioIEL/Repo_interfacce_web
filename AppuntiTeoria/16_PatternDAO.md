# DAO Pattern

Il **DAO (Data Access Object) Pattern** è un design pattern strutturale che fornisce un'astrazione dell'accesso ai dati. L'obiettivo principale di questo pattern è separare la logica di accesso ai dati dalla logica di business. Ciò consente di modificare la modalità di accesso ai dati senza influenzare il resto del sistema.

---

## Componenti del DAO Pattern

### 1. Interfaccia DAO (Data Access Object)

Definisce i metodi di accesso ai dati, che possono includere operazioni di creazione, lettura, aggiornamento e cancellazione (CRUD). L'interfaccia DAO è indipendente dal tipo specifico di sorgente dati utilizzato.

```java
public interface UserDao {
    User getById(int userId);
    void add(User user);
    void update(User user);
    void delete(User user);
    List<User> getAll();
    // Altri metodi relativi all'accesso ai dati
}
```

---

### 2. Classe concreta DAO

Implementa l'interfaccia DAO per un tipo specifico di sorgente dati, come un database relazionale, un file di testo, ecc. Contiene la logica effettiva per interagire con il particolare sorgente dati.

```java
public class UserDaoImpl implements UserDao {
    
    @Override
    public User getById(int userId) {
        // Implementazione per recuperare un utente dal database
    }

    @Override
    public void add(User user) {
        // Implementazione per aggiungere un utente nel database
    }

    @Override
    public void update(User user) {
        // Implementazione per aggiornare un utente nel database
    }

    @Override
    public void delete(User user) {
        // Implementazione per eliminare un utente dal database
    }

    @Override
    public List<User> getAll() {
        // Implementazione per recuperare tutti gli utenti dal database
    }
}
```

---

### 3. Modello di Dominio (Model)

Rappresenta l'oggetto di dominio che viene memorizzato o recuperato dal sorgente dati. Nell'esempio, `User` rappresenta l'oggetto utente.

```java
public class User {
    private int userId;
    private String username;
    private String email;
    
    // Costruttori, getter e setter
}
```

---

### 4. Client

Utilizza l'interfaccia DAO per interagire con i dati senza preoccuparsi dei dettagli di implementazione o della sorgente dati sottostante.

```java
public class Client {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();

        // Utilizzo del DAO per accedere ai dati
        User user = userDao.getById(1);
        user.setUsername("NuovoUsername");
        userDao.update(user);
    }
}
```

---

## Vantaggi del DAO Pattern

### 1. Separazione delle Responsabilità
Isola la logica di accesso ai dati dal resto del sistema, consentendo cambiamenti indipendenti in ciascun componente.

### 2. Riutilizzo del Codice
La logica di accesso ai dati è incapsulata all'interno del DAO, consentendo il riutilizzo dello stesso DAO in diverse parti dell'applicazione.

### 3. Manutenibilità
Facilita la manutenzione del codice, poiché le modifiche nel sistema di memorizzazione dati possono essere gestite facilmente modificando solo l'implementazione del DAO.

### 4. Testabilità
Semplifica il test delle operazioni di accesso ai dati, poiché è possibile sostituire facilmente un DAO con un'implementazione "mock" o di test.

Il DAO Pattern è particolarmente utile nelle applicazioni che necessitano di interagire con più sorgenti dati o che devono supportare cambiamenti nel sistema di memorizzazione dati senza impattare l'intero sistema.

---

## Diagramma UML

![dao](./img/dao_pattern_uml_diagram.jpeg)

[tutorialspoint](https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm)


# Principi SOLID - Accoppiamento tight e loose
[articolo](https://aulab.it/blog/che-cosa-sono-i-principi-solid-nella-programmazione-informatica)