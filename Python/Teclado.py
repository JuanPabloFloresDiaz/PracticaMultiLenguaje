# Clase para manejar los eventos del teclado.
class Teclado:
    # Definición de metodo estatico para validar decimales.
    @staticmethod
    def read_double():
        # Repite hasta que el valor escrito sea de tipo float
        while True:
            try:
                return float(input())
            except ValueError:
                print("Entrada inválida. Intente de nuevo:")
    # Definición de metodo estatico para validar decimales positivos.
    @staticmethod
    def read_double_positive(mensaje):
        #Solicita un número decimal positivo al usuario.
        while True:
            try:
                num = float(input(mensaje))
                if num > 0:
                    return num
                print("El número debe ser mayor que 0. Intente de nuevo:")
            except ValueError:
                print("Entrada inválida. Intente de nuevo:")

    # Definición de metodo estatico para validar enteros.
    @staticmethod
    def read_int():
        # Repite hasta que el valor escrito sea de tipo int
        while True:
            try:
                return int(input())
            except ValueError:
                print("Entrada inválida. Intente de nuevo:")
    # Definición de metodo estatico para validar campos vacios.
    @staticmethod
    def read_text():
        # Repite hasta que el valor escrito no sea vacio
        while True:
            texto = input().strip()
            if texto:
                return texto
            print("El texto no puede estar vacío. Intente de nuevo:")
