# Appunti Java — Classi, Oggetti e Garbage Collector

---

## Le Classi

Una **classe** è un tipo di dato complesso che funge da "progetto" (blueprint) per la creazione di oggetti. Si può immaginare come lo stampo per i biscotti, il progetto di un'auto o di una casa: a partire dallo stesso progetto si possono realizzare migliaia di oggetti dello stesso tipo, ognuno con caratteristiche proprie.

> "Una classe è un'astrazione indicante un insieme di oggetti che condividono le stesse caratteristiche e le stesse funzionalità"

### Cosa definisce una classe

- Le **caratteristiche** (attributi) dell'oggetto
- I **comportamenti** (metodi) che l'oggetto può eseguire

### Classe vs Istanza

Un oggetto in Java può esistere **solo se esiste la relativa classe**. La creazione di un oggetto a partire da una classe si chiama **istanziazione**.

> "Un oggetto è un'istanza (ovvero una creazione fisica) di una classe"

È possibile avere più oggetti dello stesso tipo (istanze della stessa classe), tutti diversi tra loro nei valori degli attributi ma tutti costruiti sul medesimo "stampo".

**Esempio:**

| Classe `Automobile` | Oggetto `Auto1` |
|---|---|
| Colore | Colore: Rossa |
| Velocità | Velocità: 100 km/h |
| Numero Porte | Numero Porte: 4 |
| Livello Carburante | Livello Carburante: 1/2 |
| Accelera, Frena, Rifornisci, Cambia Marcia | Accelera, Frena, Rifornisci, Cambia Marcia |

---

## Gli Oggetti

Un oggetto è un **modello di un'entità presente nel mondo reale**. Ogni oggetto è composto da due elementi fondamentali:

### Attributi
Rappresentano le **caratteristiche** dell'oggetto, cioè i dati che descrivono il suo stato.

Esempi (per un'automobile):
- Colore
- Cilindrata
- Numero Porte *(può essere costante)*
- Livello Carburante

### Metodi
Rappresentano i **comportamenti** dell'oggetto, ovvero le azioni che può compiere.

Esempi:
- `accelera()`
- `frena()`
- `cambiaMarcia()`
- `rifornisci()`

> **Nota:** alcuni metodi vanno direttamente a modificare degli attributi. Per esempio, `rifornisci()` modifica il valore di *Livello Carburante*.

---

## Il Garbage Collector

Il **Garbage Collector** è uno strumento integrato in Java per la **gestione automatica della memoria**.

### Come funziona
- Tiene traccia di tutte le variabili e gli oggetti presenti in memoria
- Individua quelli che **non sono più utilizzati** dal programma
- Li **elimina automaticamente**, liberando la memoria che occupavano

### Perché è importante
In linguaggi come C o C++, il programmatore deve gestire manualmente l'allocazione e la deallocazione della memoria. Java delega questo compito al Garbage Collector, rendendo il codice più sicuro e il programmatore libero da questa responsabilità.

Questo meccanismo è uno dei motivi per cui Java è considerato un linguaggio **robusto** e **sicuro**.

---

*Fonte: Dispensa Didattica — Corso B22-418-2025, Tecnico dello sviluppo e progettazione dei programmi informatici*
