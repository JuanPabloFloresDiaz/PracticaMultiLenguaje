using CalcularAreaRectangulo;

// Solicitar la base y la altura, además verificar que sean positivas
double baseRectangulo = Teclado.ReadDoublePositive("Ingrese la base del rectángulo:");
double alturaRectangulo = Teclado.ReadDoublePositive("Ingrese la altura del rectángulo:");
// Calcular el área del rectángulo
double area = baseRectangulo * alturaRectangulo;
// Mostrar el resultado
Console.WriteLine($"El área del rectángulo es: {area}");