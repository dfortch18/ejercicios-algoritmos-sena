# Ejercicio No. 1: Suma o Producto

Diseñe un algoritmo que lea tres números y, si el primero es positivo calcule el producto de los otros dos, y en otro caso, calcule la suma y muestre el resultado en pantalla.

## Solución

| **Datos**   | **Descripción** | **Identificadores** |
|-------------|-----------------|---------------------|
| **Entrada** |                 |                     |
| Número 1    | Primer número   | n1                  |
| Número 2    | Segundo número  | n2                  |
| **Salida**  |                 |                     |
| Resultado   | Resultado final | n3                  |

### Diagrama de flujo

<p align="center">
  <img src="./ejercicio_1_diagrama_flujo.png" alt="Diagrama de flujo ejercicio no.1">
</p>

### Pseudo codigo

```
ALGORITMO SumaOProducto;
VAR
	ENTERO n1;
	ENTERO n2;
	ENTERO n3;
	ENTERO resultado;
INICIO
	ESCRIBIR(“Digite a continuación 3 números”);
	LEER(n1);
	LEER(n2);
	LEER(n3);
	SI (n1 > 0)
		resultado <- n2 * n3;
	SINO
		resultado <- n2 + n3;
	FINSI
	ESCRIBIR(resultado);
FIN
```

### Codigo real

- **Python:** [ejercicio_1.py](./ejercicio_1.py)
