# ASSOCIAZIONE
- Concetto fondamentale della OOP

## L'associazione non ha proprietario

Non c'è nessun titolare dell'associazione. 

Gli oggetti coinvolti in un'associazione possono usarsi l'un l'altro (associazione bidirezionale), oppure uno solo usa l'altro (associazione unidirezionale), ma hanno una loro durata di vita. 

L'associazione può essere unidirezionale/bidirezionale, uno-a-uno, uno-a-molti, molti-a-uno e molti-a-molti.


# AGGREGAZIONE
Mentre un'associazione definisce la relazione tra due classi indipendenti l'una dall'altra, l'aggregazione rappresenta una relazione HAS-A tra queste due classi. 

In altre parole, due oggetti aggregati hanno il proprio ciclo di vita, ma uno degli oggetti è il proprietario della relazione HAS-A. 

Avere il proprio ciclo di vita significa che la fine di un oggetto non influirà sull'altro oggetto.


# COMPOSIZIONE
A tutti gli eggetti è un caso più restrittivo dell'aggegazione.
Praticamente ho una relazione HAS-A ma questo oggetto non può esistere da solo

## PART-OF

Per evidenziare questo accoppiamento, la relazione HAS-A può anche essere chiamata PART-OF. 

Ad esempio, un'auto ha un motore. 

In altre parole, il motore è PARTE DELL'auto. 

Se l'auto viene distrutta, anche il motore viene distrutto. 

Si dice che la composizione sia migliore dell'ereditarietà perché sostiene il riutilizzo del codice e il controllo della visibilità degli oggetti.


