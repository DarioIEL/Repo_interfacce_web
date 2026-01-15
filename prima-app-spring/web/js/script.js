fetch("http://localhost:8060/api/saluti")
.then(res =>{
    return res.json();
})
.then(resp => {
    console.log(resp);    
})