//sumMaxMin([1,3,10]) debería devolver 10 + 1 = 11, y sumMaxMin([-2,-5,-10]) debería devolver -2 + -10 = -12.

function sumMaxMin(arreglo) {
    var minimo = arreglo[0];
    var maximo = arreglo[0];

    for (var i = 0; i < arreglo.length; i++) {
        if (maximo < arreglo[i]) {
            maximo = arreglo[i];
        }
        if (minimo > arreglo[i]) {
            minimo = arreglo[i]
        }
    }
    return maximo + minimo;

}
a = sumMaxMin([-2, -5, -10]) //-12
b = sumMaxMin([1, 20, 10]) //11

console.log(a);
console.log(b);


describe("sumMaxMin", function() {
    it("sumMaxMin([1,3,10]) debería devolver 10 + 1 = 11", function() {
        expect(sumMaxMin([1, 3, 10])).toEqual(11);
    });
    it("sumMaxMin([-2,-5,-10]) debería devolver -2 + -10 = -12.", function() {
        expect(sumMaxMin([-2, -5, -10])).toEqual(-12);
    });

});