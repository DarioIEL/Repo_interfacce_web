let persone = ["Dario", "Laura", "Tina", "Oscar", "Milo", "Andrea"];

//il metodo filter restituisce un array che soddisfa una condizione

let persFiltrate = persone.filter((p) => {return p.length == 5});

console.log(persFiltrate);


let studenti =  [
    {nome: "Dario Mennillo", voto: 30},
    {nome: "Oscar Vecchione", voto: 30},
    {nome: "Laura Rossi", voto: 28},
    {nome: "Mario Bianchi", voto: 18}
]

const studBravi = studenti.filter(stud => stud.voto > 25);

console.log(studBravi);


class Docente {

    #nome  //Questa è una prop private
    constructor(nome) {
        this.#nome = nome;
    }

    get nome(){
        return this.#nome;
    }

    set nome(nome){
        this.#nome = nome;
    }
}

const doc = new Docente("Dario");
console.log(doc.nome);

console.log(JSON.stringify(doc));

class Studente{
    constructor(nome, cognome, email){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    toString(){
        return `${this.nome} ${this.cognome} - ${this.email}`;
    }
}


let stud1 = new Studente("Mario", "Roissi", "m.e@email")
let stud2 = new Studente("Mario", "Roissi", "m.e@email")
let stud3 = new Studente("Mario", "Roissi", "m.e@email")
let stud4 = new Studente("Mario", "Roissi", "m.e@email")
let stud5 = new Studente("Mario", "Roissi", "m.e@email")


console.log(JSON.stringify(stud1));

fetch(mioUrl, {
    method: "POST",
    body: {nome: "Pippo", cognome: "Verdi", email: "p.verdi @email.com"},
    keepalive: true
})
.then((data) => { return data.json()})
.then(()=>{

})
