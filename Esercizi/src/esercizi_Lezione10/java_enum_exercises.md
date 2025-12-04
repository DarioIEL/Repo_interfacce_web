# Esercizi sulle ENUM in Java

## Esercizio 1: Sistema di Gestione Ristorante

Crea un sistema per gestire gli ordini di un ristorante utilizzando le enum.

### Requisiti

#### 1. Enum CategoriaPiatto
Crea un'enum `CategoriaPiatto` con le seguenti categorie:
- ANTIPASTO
- PRIMO
- SECONDO
- CONTORNO
- DESSERT

#### 2. Enum Piatto
Crea un'enum `Piatto` che contenga almeno 8 piatti diversi. Ogni piatto deve avere:
- Nome (String)
- Categoria (usando l'enum CategoriaPiatto)
- Prezzo (double)
- Un metodo `isVegetariano()` che restituisce un boolean

**Suggerimento**: Usa un costruttore per inizializzare questi campi.

#### 3. Classe Ordine
Crea una classe `Ordine` che:
- Contenga una `List<Piatto>` per memorizzare i piatti ordinati
- Abbia un metodo `aggiungiPiatto(Piatto piatto)` per aggiungere piatti all'ordine
- Abbia un metodo `calcolaTotale()` che restituisce il prezzo totale dell'ordine
- Abbia un metodo `contaPiattiPerCategoria()` che restituisce una `Map<CategoriaPiatto, Integer>` con il conteggio dei piatti per ogni categoria
- Abbia un metodo `isVegetariano()` che verifica se l'intero ordine è vegetariano
- Abbia un metodo `stampaOrdine()` che visualizza tutti i dettagli dell'ordine

#### 4. Classe Main
Nel metodo main:
- Crea almeno 2 ordini diversi
- Aggiungi piatti agli ordini
- Stampa i dettagli completi di ogni ordine

### Esempio di Output Atteso

```
=== ORDINE 1 ===
- Bruschetta (ANTIPASTO): €5.50
- Carbonara (PRIMO): €12.00
- Tiramisu (DESSERT): €6.00
Totale: €23.50
Piatti per categoria: {ANTIPASTO=1, PRIMO=1, DESSERT=1}
Vegetariano: No

=== ORDINE 2 ===
- Insalata Mista (ANTIPASTO): €7.00
- Risotto ai Funghi (PRIMO): €14.00
- Verdure Grigliate (CONTORNO): €5.50
- Panna Cotta (DESSERT): €5.00
Totale: €31.50
Piatti per categoria: {ANTIPASTO=1, PRIMO=1, CONTORNO=1, DESSERT=1}
Vegetariano: Sì
```

---

## Esercizio 2: Sistema di Gestione Traffico Semaforico

Crea un simulatore di semaforo intelligente che gestisce il passaggio di diversi tipi di veicoli.

### Requisiti

#### 1. Enum StatoSemaforo
Crea un'enum `StatoSemaforo` con: ROSSO, GIALLO, VERDE

Ogni stato deve avere:
- Durata in secondi (int)
- Un costruttore per inizializzare la durata

Ogni stato deve implementare i seguenti metodi:
- `getDurata()`: restituisce la durata in secondi
- `prossimoStato()`: restituisce lo stato successivo (ROSSO → VERDE → GIALLO → ROSSO)
- `puoPassare()`: restituisce true solo per VERDE
- `getDescrizione()`: restituisce un messaggio descrittivo per ogni stato
  - ROSSO: "STOP! Non passare"
  - GIALLO: "ATTENZIONE! Rallenta"
  - VERDE: "VIA LIBERA! Puoi passare"

**Durate suggerite**: ROSSO = 30s, GIALLO = 5s, VERDE = 45s

#### 2. Enum TipoVeicolo
Crea un'enum `TipoVeicolo` con: AUTO, MOTO, AUTOBUS, BICICLETTA, AMBULANZA

Ogni tipo deve avere:
- Priorità (int da 1 a 5, dove 5 è la massima priorità)
- Un costruttore per inizializzare la priorità

Ogni tipo deve implementare i seguenti metodi:
- `getPriorita()`: restituisce la priorità
- `puoPassareConRosso()`: restituisce true solo per AMBULANZA

**Priorità suggerite**: AUTO = 2, MOTO = 2, AUTOBUS = 3, BICICLETTA = 1, AMBULANZA = 5

#### 3. Classe Semaforo
Crea una classe `Semaforo` che:
- Ha un campo `statoCorrente` di tipo `StatoSemaforo` (inizialmente ROSSO)
- Ha un metodo `getStatoCorrente()` che restituisce lo stato attuale
- Ha un metodo `cambiaStato()` che passa allo stato successivo
- Ha un metodo `verificaPassaggio(TipoVeicolo veicolo)` che restituisce true se il veicolo può passare (considerando sia lo stato del semaforo che le caratteristiche del veicolo)
- Ha un metodo `stampaStato()` che visualizza lo stato corrente con durata e descrizione

#### 4. Classe Main
Nel metodo main:
- Crea un oggetto Semaforo
- Simula una sequenza di almeno 5 cambi di stato
- Per ogni stato, testa il passaggio di almeno 3 tipi diversi di veicoli
- Stampa tutti i risultati in modo chiaro e leggibile

### Esempio di Output Atteso

```
=== SIMULAZIONE SEMAFORO ===

Stato: ROSSO (30 secondi) - STOP! Non passare
- AUTO può passare? No
- MOTO può passare? No
- AMBULANZA può passare? Sì (veicolo di emergenza)

--- Cambio stato ---

Stato: VERDE (45 secondi) - VIA LIBERA! Puoi passare
- AUTO può passare? Sì
- BICICLETTA può passare? Sì
- AUTOBUS può passare? Sì

--- Cambio stato ---

Stato: GIALLO (5 secondi) - ATTENZIONE! Rallenta
- AUTO può passare? No
- AMBULANZA può passare? Sì (veicolo di emergenza)

--- Cambio stato ---

Stato: ROSSO (30 secondi) - STOP! Non passare
- AUTOBUS può passare? No
- AMBULANZA può passare? Sì (veicolo di emergenza)
- BICICLETTA può passare? No
```