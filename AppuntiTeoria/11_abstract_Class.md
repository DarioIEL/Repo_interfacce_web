## Classi astratte in Java

Una classe astratta è una classe che non può essere istanziata direttamente e che può contenere (oppure no) metodi astratti (metodi dichiarati ma non implementati). Le classi astratte servono come "template" per altre classi e sono progettate per essere estese.

### REgole e caratteristiche delle classi astratte

- Dichiarate con la keyword `abstract`
- Possono contenere metodi astratti (dichiarati con `abstract` e senza implementazione)
- Possono contenere anche metodi concreti (con implementazione)
- Non possono essere istanziate con l'operatore `new`
- Le sottoclassi devono implementare tutti i metodi astratti o essere dichiarate anch'esse astratte
- Possono avere costruttori (utilizzati dalle sottoclassi)
    - Se la classe astratta definisce uno o più costruttori con argomenti (e nessun costruttore di default) allora ogni sottoclasse dovrà esplicitamente richiamare uno dei costruttori della superclasse (utilizza super()). Quindi la sottoclasse deve avere un costruttore.
- Possono avere campi, costanti e metodi statici

### Quando usare le classi astratte

- Quando si vuole condividere codice tra classi strettamente correlate
- Quando le classi che ereditano hanno molti metodi o campi in comune
- Quando si vuole dichiarare metodi non-statici o non-final che le sottoclassi devono implementare
- Quando si ha bisogno di accedere a modificatori diversi da public (protected, private)

### Perché si usa `protected` 
La proprietà `protected` viene usata per le proprietà delle classi astratte come buona norma. Essendoci ereditarietà singola è molto più comodo accedere direttamente alle props dichiarate nella classe astratta