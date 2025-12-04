# Esercizi su Try-Catch e Throws in Java

## Esercizio 1: Gestione base di eccezioni
Scrivi un programma che:
- Chiede all'utente di inserire due numeri
- Esegue la divisione tra i due numeri
- Gestisce l'eccezione `ArithmeticException` (divisione per zero)
- Gestisce l'eccezione `InputMismatchException` (input non numerico)

---

## Esercizio 2: Array e IndexOutOfBoundsException
Crea un programma che:
- Dichiara un array di 5 elementi interi
- Chiede all'utente di inserire un indice
- Mostra l'elemento in quella posizione
- Gestisce `ArrayIndexOutOfBoundsException` con un messaggio appropriato

---

## Esercizio 3: Metodo con throws
Scrivi una classe `Calcolatrice` con un metodo `dividi(int a, int b)` che:
- Dichiara `throws ArithmeticException`
- Lancia l'eccezione se b è zero
- Nel main, chiama questo metodo e gestisci l'eccezione con try-catch

---

## Esercizio 4: Lettura file (simulata)
Crea un metodo `leggiFile(String nomeFile)` che:
- Dichiara `throws FileNotFoundException`
- Se il nome file è vuoto, lancia l'eccezione
- Nel main, gestisci l'eccezione appropriatamente

---

## Esercizio 5: Multiple catch
Scrivi un programma che:
- Converte una stringa in numero intero
- Accede a un elemento di un array
- Usa multiple catch per gestire:
  - `NumberFormatException`
  - `ArrayIndexOutOfBoundsException`
  - `NullPointerException`

---

## Esercizio 6: Finally block
Crea un programma che simula l'apertura di una risorsa:
- Usa una variabile boolean `risorsaAperta`
- Nel try: imposta `risorsaAperta = true` e simula un'operazione
- Nel catch: gestisci un'eccezione generica
- Nel finally: chiudi la risorsa (imposta `risorsaAperta = false`) e stampa un messaggio

---

## Esercizio 7: Eccezione personalizzata
Crea una classe `EtaNonValidaException` che estende `Exception` e:
- Un metodo `verificaEta(int eta)` che lancia questa eccezione se eta < 0 o eta > 120
- Nel main, gestisci questa eccezione personalizzata

---

## Esercizio 8: Propagazione delle eccezioni
Crea tre metodi:
- `metodo1()` che chiama `metodo2()`
- `metodo2()` che chiama `metodo3()`
- `metodo3()` che lancia un'eccezione
- Usa `throws` per propagare l'eccezione fino al main, dove verrà gestita con try-catch