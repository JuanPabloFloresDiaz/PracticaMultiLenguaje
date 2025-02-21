import Teclado

# Solicita la base y la altura,
# estas se verifican desde el manejador del teclado que sean números positivos.
base = Teclado.Teclado.read_double_positive("Ingrese la base del rectángulo: ")
altura = Teclado.Teclado.read_double_positive("Ingrese la altura del rectángulo: ")

# Se realiza el calulo del área.
area = base * altura
# Se imprime el resultado.
print(f"El área del rectángulo es: {area}")
