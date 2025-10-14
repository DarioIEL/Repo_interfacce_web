# Passaggio Parametri in Java

## Passaggio per Valore (Pass by Value)
* **Cosa succede:** quando passi una variabile come argomento a un metodo, viene creata una copia del valore di quella variabile. Qualsiasi modifica apportata alla copia all'interno del metodo non influisce sulla variabile originale.
* **Tipi di dati:** questo comportamento si applica ai tipi di dati primitivi in Java (int, double, boolean, ecc.).

### Esempio di passaggio per valore

```java
public class PassaggioValore {

    public static void modificaValore(int x) {
        x = 20; // Modifica la copia locale di x
        System.out.println("Dentro il metodo: x = " + x);
    }

    public static void main(String[] args) {
        int numero = 10;
        modificaValore(numero);
        System.out.println("Fuori dal metodo: numero = " + numero);
    }
}
```

* **Output:**
```
Dentro il metodo: x = 20
Fuori dal metodo: numero = 10
```

* **Spiegazione:** La variabile `numero` mantiene il suo valore originale di 10 perché il metodo `modificaValore` opera su una copia del suo valore.

## Passaggio per Riferimento (Pass by Reference)
* **Cosa succede:** tecnicamente, Java passa sempre i valori, pure per gli oggetti. Quando passi un oggetto come argomento a un metodo, viene passata una copia del *riferimento* all'oggetto. Questo significa che sia la variabile originale che la copia del riferimento puntano alla stessa area di memoria. Di conseguenza, le modifiche apportate all'oggetto tramite il riferimento nel metodo influenzano l'oggetto originale.
* **Tipi di dati:** questo comportamento si applica agli oggetti in Java (istanze di classi).

### Esempio di passaggio del riferimento dell'oggetto

```java
public class PassaggioRiferimento {

    static class Persona {
        String nome;
    }

    public static void modificaNome(Persona persona) {
        persona.nome = "Bob"; // Modifica l'oggetto originale
        System.out.println("Dentro il metodo: nome = " + persona.nome);
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nome = "Alice";
        modificaNome(persona);
        System.out.println("Fuori dal metodo: nome = " + persona.nome);
    }
}
```

* **Output:**
```
Dentro il metodo: nome = Bob
Fuori dal metodo: nome = Bob
```

* **Spiegazione:** Il metodo `modificaNome` modifica l'attributo `nome` dell'oggetto `persona` originale perché opera tramite il riferimento all'oggetto.

## In Sintesi
* Java utilizza sempre il passaggio per valore.
* Con i tipi primitivi, viene passata una copia del valore.
* Con gli oggetti, viene passata una copia del riferimento all'oggetto.