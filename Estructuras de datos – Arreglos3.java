 int[] numeros = {1, 2, 3, 4, 5,6,7,8,9,0};
int buscar = 4;
for (int i = 0; i < numeros.length; i++) {
    if (numeros[i] == buscar) {
        System.out.println("El elemento se encuentra en el índice: " + i);
        break;
    }
}
