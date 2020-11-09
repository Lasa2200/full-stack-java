//¿Cómo harías print/log de la edad de John?
//¿Cómo harías print/log del nombre del primer objeto?
//¿Cómo harías print/log del nombre y la edad de cada usuario utilizando un for loop? 
//Tu output debería verse algo como esto
//¿Cómo harías para imprimir el nombre de los mayores de edad?


var users = [
    { name: "Michael", age: 37 },
    { name: "John", age: 30 },
    { name: "David", age: 27 }
];

console.log(users[1].age);
console.log(users[1].name);


function loops(array) {
    for (var i = 0; i < array.length; i++) {
        console.log(array[i].age);
        console.log(array[i].name);
    }

}

loops(users);


function itirenar(array) {
    for (Persona of array) {
        console.log(Persona.name + " - " + Persona.age);
    }
}
itirenar(users);


// output 
//Michael - 37
//John - 30
//David - 27