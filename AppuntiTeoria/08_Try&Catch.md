# Eccezioni in Java

Le **eccezioni** in Java rappresentano eventi anomali o condizioni di errore che interrompono il normale flusso di esecuzionedi un programma. Forniscono un meccanismo strutturato per gestire queste situazioni impreviste, rendendo il codice più robusto e manutenibile.

## Tipi di Eccezioni

1.  **Eccezioni Controllate (Checked Exceptions):**
    * Devono essere **gestite esplicitamente** nel codice (tramite `try-catch`) o dichiarate nella firma del metodo (con `throws`).
    * Il compilatore verifica che vengano gestite.
    * Esempio comune: `IOException`.

2.  **Eccezioni Non Controllate (Unchecked Exceptions / Runtime Exceptions):**
    * Non è obbligatorio gestirle esplicitamente, ma è spesso consigliabile.
    * Solitamente derivano da errori di programmazione o condizioni anomale a runtime.
    * Esempi comuni: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

## Blocchi Try-Catch

Il costrutto `try-catch` permette di gestire le eccezioni:

```java
try {
    // Codice che potrebbe lanciare un'eccezione
} catch (TipoEccezione e) {
    // Blocco per gestire l'eccezione di tipo TipoEccezione
    // 'e' è un riferimento all'oggetto eccezione
}