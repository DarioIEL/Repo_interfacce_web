# Java Collections Framework (JCF) - Come gestire gli insiemi di dati

## Introduzione

Il **Java Collections Framework (JCF)** è un'architettura unificata per rappresentare e manipolare collezioni di oggetti in Java. Fornisce interfacce, implementazioni e algoritmi per gestire gruppi di oggetti in modo efficiente e standardizzato.

Con il termine **Collection** si fa riferimento ad un singolo oggetto, descritto da una classe, che
al suo interno raggruppa un insieme di elementi.

## Vantaggi del JCF

- **Riduce lo sforzo di programmazione** fornendo strutture dati e algoritmi già implementati
- **Aumenta le performance** grazie a implementazioni ottimizzate
- **Fornisce interoperabilità** attraverso interfacce comuni
- **Facilita l'apprendimento** con API consistenti
- **Promuove il riuso del software** attraverso componenti standardizzati

## Architettura del Framework

Il JCF è basato su una gerarchia di **interfacce** con multiple **implementazioni** concrete:

```
Collection (interfaccia radice)
├── List (interfacce figlie)
├── Set
└── Queue
    └── Deque

Map (interfaccia separata, non estende Collection)
```

## Interfacce Principali

### Collection
L'interfaccia radice che definisce operazioni comuni per tutti i gruppi di oggetti:
- `add()`, `remove()`, `contains()`
- `size()`, `isEmpty()`, `clear()`
- `iterator()`, `toArray()`

### List
Collezione **ordinata** che **ammette duplicati**:
- Accesso per indice: `get(index)`, `set(index, element)`
- Ricerca: `indexOf()`, `lastIndexOf()`
- Iterazione bidirezionale con `ListIterator`

### Set
Collezione che **non ammette duplicati**:
- Basato sul concetto matematico di insieme
- Metodi ereditati da Collection
- Controllo automatico dei duplicati

### Queue
Collezione per gestire elementi in modalità **FIFO** (First-In-First-Out):
- `offer()`, `poll()`, `peek()` (non lanciano eccezioni)
- `add()`, `remove()`, `element()` (lanciano eccezioni)

### Map
Interfaccia separata per associazioni **chiave-valore**:
- `put()`, `get()`, `remove()`
- `keySet()`, `values()`, `entrySet()`
- Non estende Collection ma è parte del framework

## Implementazioni Concrete

### Implementazioni di List

#### ArrayList
- **Struttura**: Array ridimensionabile
- **Performance**: O(1) per accesso, O(n) per inserimento/rimozione in mezzo
- **Uso ideale**: Accesso frequente per indice, poche modifiche strutturali

#### LinkedList
- **Struttura**: Lista doppiamente collegata
- **Performance**: O(1) per inserimento/rimozione, O(n) per accesso per indice
- **Uso ideale**: Frequenti inserimenti/rimozioni, implementa anche Deque

### Implementazioni di Set

#### HashSet
- **Struttura**: Tabella hash
- **Performance**: O(1) per operazioni base
- **Caratteristiche**: Non mantiene ordine, permette un null

#### LinkedHashSet
- **Struttura**: Hash table + lista collegata
- **Caratteristiche**: Mantiene ordine di inserimento
- **Performance**: Leggermente più lenta di HashSet

#### TreeSet
- **Struttura**: Albero rosso-nero (Red-Black Tree)
- **Performance**: O(log n) per operazioni base
- **Caratteristiche**: Elementi ordinati naturalmente o tramite Comparator

### Implementazioni di Map

#### HashMap
- **Struttura**: Tabella hash
- **Performance**: O(1) per operazioni base
- **Caratteristiche**: Non sincronizzata, permette null

#### LinkedHashMap
- **Struttura**: Hash table + lista collegata
- **Caratteristiche**: Mantiene ordine di inserimento o accesso
- **Uso**: Cache con politica LRU

#### TreeMap
- **Struttura**: Albero rosso-nero
- **Performance**: O(log n) per operazioni base
- **Caratteristiche**: Chiavi ordinate

## Algoritmi e Utilità

### Classe Collections
Fornisce algoritmi statici per operazioni comuni:

#### Ordinamento
```java
Collections.sort(list);
Collections.sort(list, comparator);
Collections.reverse(list);
```

#### Ricerca
```java
Collections.binarySearch(list, key);
Collections.min(collection);
Collections.max(collection);
```

#### Manipolazione
```java
Collections.shuffle(list);
Collections.fill(list, object);
Collections.copy(dest, src);
```

### Classe Arrays
Utilità per array che si integrano con le collezioni:
```java
Arrays.asList(array);
Arrays.sort(array);
Arrays.binarySearch(array, key);
```

## Scelta dell'Implementazione

### Criteri di Scelta

#### Per List:
- **ArrayList**: Accesso frequente per indice
- **LinkedList**: Frequenti inserimenti/rimozioni, uso come queue/stack

#### Per Set:
- **HashSet**: Performance massima, ordine non importante
- **LinkedHashSet**: Serve mantenere ordine di inserimento
- **TreeSet**: Serve ordinamento automatico

#### Per Map:
- **HashMap**: Uso generale, performance massima
- **LinkedHashMap**: Cache o quando serve ordine
- **TreeMap**: Chiavi ordinate necessarie

### Considerazioni sulle Performance

| Operazione | ArrayList | LinkedList | HashSet | TreeSet | HashMap | TreeMap |
|------------|-----------|------------|---------|---------|---------|---------|
| Accesso    | O(1)      | O(n)       | O(1)    | O(log n)| O(1)    | O(log n)|
| Inserimento| O(n)*     | O(1)       | O(1)    | O(log n)| O(1)    | O(log n)|
| Rimozione  | O(n)      | O(1)       | O(1)    | O(log n)| O(1)    | O(log n)|

*O(1) per inserimento in coda

## Concorrenza

### Problemi con la Concorrenza
Le implementazioni standard **non sono thread-safe** (eccetto Vector e Hashtable legacy).

### Soluzioni:

## Iteratori

### Iterator
Interfaccia base per attraversare collezioni:
```java
Iterator<String> it = collection.iterator();
while (it.hasNext()) {
    String element = it.next();
    // it.remove(); // rimozione sicura durante iterazione
}
```

### ListIterator
Estende Iterator per liste con navigazione bidirezionale:
```java
ListIterator<String> lit = list.listIterator();
// Metodi aggiuntivi: hasPrevious(), previous(), set(), add()
```


## Generics e Type Safety

Dal Java 5, le collezioni supportano i **Generics** per type safety a compile-time:

```java
// Senza generics (sconsigliato)
List list = new ArrayList();
list.add("string");
String s = (String) list.get(0); // cast necessario

// Con generics (raccomandato)
List<String> list = new ArrayList<>();
list.add("string");
String s = list.get(0); // no cast necessario
```


## Best Practices

1. **Usa l'interfaccia più generale possibile** come tipo di variabile:
   ```java
   List<String> list = new ArrayList<>(); // Buono
   ArrayList<String> list = new ArrayList<>(); // Evitare
   ```

2. **Specifica sempre i generics** per type safety

3. **Usa diamond operator** (Java 7+):
   ```java
   Map<String, List<Integer>> map = new HashMap<>();
   ```

4. **Scegli l'implementazione giusta** basandoti sui pattern di utilizzo

5. **Implementa equals() e hashCode()** correttamente per oggetti custom in Set/Map
