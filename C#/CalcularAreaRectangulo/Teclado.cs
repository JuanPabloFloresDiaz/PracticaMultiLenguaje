using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CalcularAreaRectangulo
{
    // Clase para leer datos desde la consola
    internal class Teclado
    {
        // Leer un número real
        public static double ReadDouble()
        {
            // Leer una línea de la consola
            double numero;
            // Mientras no se pueda convertir a double, seguir pidiendo el número
            while (!double.TryParse(Console.ReadLine(), out numero))
            {
                Console.WriteLine("Entrada inválida. Intente de nuevo:");
            }
            return numero;
        }
        // Leer un número real positivo
        public static double ReadDoublePositive(string mensaje)
        {
            // Leer una línea de la consola
            double numero;
            // Mientras no se pueda convertir a double o sea menor o igual a 0, seguir pidiendo el número
            while (true)
            {
                Console.WriteLine(mensaje);
                if (double.TryParse(Console.ReadLine(), out numero) && numero > 0)
                {
                    return numero;
                }
                Console.WriteLine("El número debe ser mayor que 0. Intente de nuevo:");
            }
        }
        // Leer un número entero
        public static int ReadInt()
        {
            // Leer una línea de la consola
            int numero;
            // Mientras no se pueda convertir a int, seguir pidiendo el número
            while (!int.TryParse(Console.ReadLine(), out numero))
            {
                Console.WriteLine("Entrada inválida. Intente de nuevo:");
            }
            return numero;
        }
        // Leer un texto
        public static string ReadText()
        {
            // Leer una línea de la consola
            string texto;
            // Mientras el texto esté vacío, seguir pidiendo el texto
            do
            {
                texto = Console.ReadLine().Trim();
                if (string.IsNullOrEmpty(texto))
                {
                    Console.WriteLine("El nombre no puede estar vacío. Intente de nuevo:");
                }
            } while (string.IsNullOrEmpty(texto));

            return texto;
        }
    }
}
