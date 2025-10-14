# Ereditarietà in Java

L'ereditarietà è uno dei concetti fondamentali della programmazione orientata agli oggetti in Java. 

## Cos'è l'ereditarietà?

L'ereditarietà permette di creare una nuova classe (sottoclasse) basata su una classe esistente (superclasse). La sottoclasse eredita tutti i membri (campi e metodi) della superclasse e può:
- Aggiungere nuovi campi e metodi
- Sovrascrivere i metodi esistenti
- Utilizzare i membri ereditati

In Java, l'ereditarietà si implementa usando la parola chiave `extends`.

## Caratteristiche dell'ereditarietà in Java

- **Ereditarietà singola**: Java supporta solo l'ereditarietà singola (una classe può estendere SOLO una superclasse)
- **Modificatore `protected`**: Permette l'accesso ai membri della superclasse dalle sottoclassi
- **Parola chiave `super`**: Permette di chiamare metodi della superclasse dalla sottoclasse
- **Classe Object**: Tutte le classi in Java derivano implicitamente dalla classe `Object`
- **Polimorfismo**: Un riferimento di tipo superclasse può puntare a oggetti delle sottoclassi

## Vantaggi dell'ereditarietà

- **Riutilizzo del codice**: Evita la duplicazione di codice
- **Estensibilità**: Facilita l'aggiunta di nuove funzionalità
- **Gerarchia di classi**: Crea una struttura logica e organizzata
- **Manutenibilità**: Rende il codice più modulare e facile da mantenere

## Considerazioni pratiche

- Non abusare dell'ereditarietà; a volte la composizione è preferibile
- Progettare attentamente la gerarchia delle classi fin dall'inizio
- Considerare l'utilizzo di classi astratte e interfacce per definire contratti più flessibili
- Ricordare il principio "is-a": una sottoclasse dovrebbe sempre essere un tipo della sua superclasse