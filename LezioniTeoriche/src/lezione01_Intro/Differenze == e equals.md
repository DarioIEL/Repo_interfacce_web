# `==` vs `.equals()` in Java

## Il problema

In Java, `==` applicato a oggetti confronta l'**indirizzo in memoria** (il riferimento),
non il contenuto. Due variabili String possono contenere lo stesso testo ma puntare
a zone di memoria diverse: in quel caso `==` restituisce `false` anche se il valore è identico.

`.equals()` invece confronta il contenuto **carattere per carattere**, restituendo
il risultato corretto.

---

## String Pool vs Heap

La JVM gestisce le stringhe in due aree distinte:

- **String Constant Pool** (dentro l'Heap): area speciale per i letterali stringa.
  Se dichiari `String mioNome = "Dario"`, la JVM salva `"Dario"` nel pool.
  Se un'altra variabile ha lo stesso letterale, punta allo **stesso oggetto** già esistente.

- **Heap (normale)**: usando `new String("Dario")`, la JVM **crea obbligatoriamente
  un nuovo oggetto** in una zona separata dell'Heap, indipendentemente da ciò che
  c'è nel pool.

---

## Esempio pratico

```java
String mioNome = "Dario";             // → punta al String Pool
String tuoNome = new String("Dario"); // → crea un nuovo oggetto nell'Heap

System.out.println(mioNome == tuoNome);      // false → indirizzi diversi!
System.out.println(mioNome.equals(tuoNome)); // true  → contenuto uguale!
```

---

## Regola pratica

| Operatore   | Confronta                        | Quando usarlo                          |
|-------------|----------------------------------|----------------------------------------|
| `==`        | Riferimento (indirizzo memoria)  | Solo per `null` check o tipi primitivi |
| `.equals()` | Contenuto (valore dei caratteri) | Sempre per confrontare stringhe        |

---

## ⚠️ Caso particolare

```java
String a = "Dario";
String b = "Dario";

System.out.println(a == b); // true → stesso oggetto nel String Pool!
```

Qui `a == b` è `true` perché la JVM ottimizza riutilizzando i letterali identici nel pool.
**Non fare affidamento su questo comportamento**: usa sempre `.equals()`.
