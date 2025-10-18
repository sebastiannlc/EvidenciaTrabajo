package Modelo;

public class CarroCompra {

    private final int[][] productos;

    public CarroCompra() {
        this.productos = new int[2][5];

        for (int i = 0; i < 5; i++) {
            this.productos[0][i] = 1;
            this.productos[1][i] = 1000;
        }
    }

    private int calcularTotal() {
        int total = 0, subTotal = 0;

        for (int i = 0; i < 5; i++) {
            total += subTotal(this.productos[0][i], this.productos[1][i]);
        }
        return total;
    }

    private int subTotal(int cant, int precio) {
        Calculadora calc = new Calculadora(cant, precio);

        return calc.multiplicar();
    }

    public void mostrarTotal() {
        int total = calcularTotal();
        System.out.println("El total de la compra es: " + this.calcularTotal());
    }

}

