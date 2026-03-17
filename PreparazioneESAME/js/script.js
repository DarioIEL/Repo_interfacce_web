let elEventi = document.querySelector("#eventi")

function scaricaEventi(){

    fetch("http://localhost:3000/eventi")
    .then(data => {
        return data.json();
    })
    .then(response => {
        console.log(response);
        response.forEach(evento => {
            elEventi.appendChild( createList(evento));
        });
    })
}

function createList(evento){
    let li = document.createElement("li"); 
    let btnCompra = document.createElement("button");

    li.innerHTML = `<li> ${evento.titoloEvento} - ${evento.descrizione} - ${evento.costoFoto} </li>`;

    btnCompra.addEventListener("click", function(){
        acquista(evento);
    });
    btnCompra.textContent = "Acquista";

    li.appendChild(btnCompra);

    return li;
}

/**
 * @param {*} evento 
 * Questa funzione mette l'evento nel carrello. Si occupa di fare la post nella prop carrello
 */
function acquista(evento) {
    console.log(evento);
    fetch("http://localhost:3000/carrello", {
        method: "POST",
        headers: {
            "Content-Type" : "application/json"
        },
        body: JSON.stringify(evento)
    })
    .then((response) => response.json())
}

document.addEventListener("DOMContentLoaded", scaricaEventi);